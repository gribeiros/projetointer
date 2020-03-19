package com.br.bikeshop.controller.impl;

import com.br.bikeshop.controller.BikeController;
import org.springframework.stereotype.Controller;

@Controller
public class BikeControllerImpl implements BikeController {

	@Override
	public String home() {
		return "Ok";
	}

}
