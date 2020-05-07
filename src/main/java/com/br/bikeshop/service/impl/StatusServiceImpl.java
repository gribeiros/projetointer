package com.br.bikeshop.service.impl;

import com.br.bikeshop.repository.StatusRepository;
import com.br.bikeshop.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    StatusRepository statusRepository;
}
