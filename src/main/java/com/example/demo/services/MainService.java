package com.example.demo.services;

import com.example.demo.entities.ApplicationBean;
import com.example.demo.entities.Audit;
import com.example.demo.entities.FileItems;
import com.sun.deploy.net.HttpResponse;
import net.minidev.json.JSONObject;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.net.www.http.HttpClient;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.List;


@RestController
@RequestMapping("/application")
public class MainService {

	private ApplicationBean applicationBean;
	private Audit audit;
	@Autowired
	private Storage storage;


	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ApplicationBean save(@RequestBody ApplicationBean list) {
		// TODO Auto-generated method stub
		applicationBean = list;
		//applicationBean.setUpdate_timestamp(String.valueOf(System.currentTimeMillis()));
		try {
			for (int i = 0; i < storage.tokens.size(); i++) {
				sendPost(storage.tokens.get(i));

			}


		} catch (IOException e) {
			e.printStackTrace();
		}
		storage.applicationBean = applicationBean;

		return applicationBean;
	}


	@RequestMapping(value = "/audit/save", method = RequestMethod.POST)
	public Audit save(@RequestBody Audit list) {
		// TODO Auto-generated method stub
		audit = list;

		List<FileItems> fileItems = audit.getFileItemses();
		for (int i = 0; i < fileItems.size(); i++) {
			File f = new File("files/" + fileItems.get(i).getName());

			if (f.exists()) ;
			fileItems.get(i).setPath_server("/files/" + fileItems.get(i).getName());
		}

		try {
			for (int i = 0; i < storage.tokens.size(); i++) {
				sendPost(storage.tokens.get(i));
			}


		} catch (IOException e) {
			e.printStackTrace();
		}
		storage.audit = audit;

		return audit;
	}

	@RequestMapping(value = "/checkname", method = RequestMethod.GET)
	public Boolean checkName(@RequestParam String name) {
		// TODO Auto-generated method stub
		File f = new File("files/" + name);

		return f.exists();
	}

	/*	@RequestMapping(value="/files/{name}",method=RequestMethod.GET)
        public String downloadFile(@PathVariable (value = "name") String name) {
            // TODO Auto-generated method stub
          *//*  File f = new File("files/"+name);
	    if(f.exists()) {

			try {
				System.out.println(f.getPath());
				System.out.println(f.getAbsolutePath());
				System.out.println(f.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}

			return f;
		}

		return null;*//*

		String encodedfile = null;
		try {
			File file=new File("files/"+name);
			System.out.println("====> path : "+file.getPath());
			FileInputStream fileInputStreamReader = new FileInputStream(file);
			byte[] bytes = new byte[(int)file.length()];
			fileInputStreamReader.read(bytes);
			encodedfile =new String(Base64.getEncoder().encode(bytes));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return encodedfile;

	}*/
	@RequestMapping(value = "/get1", method = RequestMethod.GET)
	public ApplicationBean get() {

		return applicationBean;
	}

	@RequestMapping(value = "/audit/get", method = RequestMethod.GET)
	public Audit getAudit() {

		return audit;
	}

/*	@RequestMapping(value="/get",method=RequestMethod.GET)
	public List<Audit> get() {
		// TODO Auto-generated method stub
		return audit;
	}*/


	public String sendPost(String token) throws IOException {

		final String AUTH_KEY_FCM = "AAAAt_qsZks:APA91bEKPf9Xm5w3VSjNESGDV7l11CWlyk0XvYms1kKQOxYe-QIMDC6tQnKaQETXKF9SCzW25UiVGxVBTutB94e9C6dYTZI6lxMRBtaSvSvrKmMbSAxuulhq415JDXKztSl2JU1r9Dpp";
		final String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";
		String result = "";
		URL url = new URL(API_URL_FCM);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setUseCaches(false);
		conn.setDoInput(true);
		conn.setDoOutput(true);

		conn.setRequestMethod("POST");
		conn.setRequestProperty("Authorization", "key=" + AUTH_KEY_FCM);
		conn.setRequestProperty("Content-Type", "application/json");

		JSONObject json = new JSONObject();

		json.put("to", token);
		JSONObject info = new JSONObject();
		JSONObject data = new JSONObject();

		data.put("table", "Audit");
		//data.put("time_stamp", audit.getUpdate_timestamp());
		data.put("id_audit", audit.getId() + "");

		info.put("title", "notification title"); // Notification title
		info.put("body", "message body"); // Notification
		// body
		json.put("notification", info);
		json.put("data", data);
		try {
			OutputStreamWriter wr = new OutputStreamWriter(
					conn.getOutputStream());
			wr.write(json.toString());
			wr.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			result = "SUCCESS";
		} catch (Exception e) {
			e.printStackTrace();
			result = "FAILURE";
		}
		System.out.println("GCM Notification is sent successfully");

		return result;
	}

	@RequestMapping(value = "/value", method = RequestMethod.POST)
	public void save(@RequestParam String token) {
		storage.tokens.add(token);
		System.out.println("token ==> " + token);
	}

	@RequestMapping(value = "/files", method = RequestMethod.POST, headers = "Content-Type=multipart/form-data")
	public @ResponseBody
	String handleFormUpload(@RequestParam("file") MultipartFile file, @RequestParam("name") String description) {

		if (!file.isEmpty()) {
			System.out.println("====> fichier " + description);
			byte[] bytes = null;
			try {
				bytes = file.getBytes();

				File fi = new File("files/" + description);
				fi.getParentFile().mkdirs();
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((new FileOutputStream(fi)));
				bufferedOutputStream.write(bytes);
				bufferedOutputStream.close();
			} catch (IOException e) {
				System.out.println("error processing uploaded file" + e.getMessage());
			}
			return "file upload received! Name:[" + description + "] Size:["
					+ bytes.length + "]";
		} else {
			System.out.println("===> file upload failed!!");
			return "file upload failed!";
		}
	}

	/*@RequestMapping(value="/files/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveTemp(@RequestParam("file") MultipartFile file) {


		String nomFichier = file.getOriginalFilename();
		System.out.println("nomFichier ==> "+nomFichier);
		try {
			byte[] bytes = file.getBytes();
			File fi = new File("files/"+nomFichier);
			fi.getParentFile().mkdirs();
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((new FileOutputStream(fi)));
			bufferedOutputStream.write(bytes);
			bufferedOutputStream.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("probleme de recepetion spring"+e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}*/
	/*@RequestMapping(value = "/files/{file_name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public FileSystemResource getFile(@PathVariable("file_name") String fileName) {
		return new FileSystemResource(new File("./files/"+fileName));
	}*/

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public void getDownload(HttpServletResponse response, @RequestParam  String name) throws IOException {

		// Get your file stream from wherever.
		InputStream myStream = new FileInputStream(new File("files/aage2012.pdf"));

		// Set the content type and attachment header.
		response.addHeader("Content-disposition", "attachment;filename=aage2012.pdf");
		response.setContentType("*/*");

		// Copy the stream to the response's output stream.
		IOUtils.copy(myStream, response.getOutputStream());
		response.flushBuffer();
	}
}
