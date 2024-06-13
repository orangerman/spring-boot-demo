package com.javafan.mapstruct.demo;

import com.alibaba.fastjson2.JSON;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author fzq
 * @Date 2024/6/13 9:34
 * @Version 1.0
 */
@RestController
@RequestMapping("car")
@RequiredArgsConstructor
@Slf4j
public class CarController {

  @PostMapping("buildCar")
  public String buildCar(@RequestBody CarDto carDto){
    Car car = CarMapper.MAPPER.carDtoToCar(carDto);
    log.info("{}", JSON.toJSONString(car));
    return "success";
  }


}
