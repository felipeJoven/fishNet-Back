package com.fish.fishNet.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fish.fishNet.Controller.Impl.BaseControllerImpl;
import com.fish.fishNet.Model.Pesca;
import com.fish.fishNet.Service.Impl.PescaServiceImpl;

@RestController
@RequestMapping("api/V1/pesca")
@CrossOrigin(origins="*")
public class PescaController extends BaseControllerImpl<Pesca, PescaServiceImpl> {

}
