package com.javafan.mapstruct.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Description car转换mapper
 * @Author fzq
 * @Date 2024/6/13 9:28
 * @Version 1.0
 */
@Mapper
public interface CarMapper {

  CarMapper MAPPER = Mappers.getMapper(CarMapper.class);

  @Mapping(source = "carName", target = "name")
  Car carDtoToCar(CarDto carDto);
}
