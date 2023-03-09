package com.example.kursovayafromsocks1.service;


import com.example.kursovayafromsocks1.dto.SocksDto;
import com.example.kursovayafromsocks1.dto.request.SocksParamsRequest;
import com.example.kursovayafromsocks1.exceptions.InvalidRequestParamsException;
import com.example.kursovayafromsocks1.exceptions.NotEnoughItemsException;
import com.example.kursovayafromsocks1.exceptions.SocksNotFoundException;

public interface SocksService {

    SocksDto incomeSocks(SocksDto socksDto);

    SocksDto outcomeSocks(SocksDto socksDto) throws SocksNotFoundException, NotEnoughItemsException;

    long getSocksCountByParams(SocksParamsRequest params) throws InvalidRequestParamsException;
}