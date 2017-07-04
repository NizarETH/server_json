package com.example.demo.services;

import com.example.demo.entities.ApplicationBean;
import com.example.demo.entities.Audit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nizar on 13/06/17.
 */
@Service
public class Storage {

    public ApplicationBean applicationBean;
    public Audit audit;
    public List<String> tokens = new ArrayList<>();


}
