package com.side.demo.common;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public class ResultVo<T> {
	
	private String result;
	private String resultMessage;
	private T data;
	
	@Builder
	public ResultVo(String result, String resultMessage, T data) {
		
		this.result = result;
		this.resultMessage = resultMessage;
		this.data = data;
	}
	
	
	 public ResultVo success(String resultMessage,T data) {
	        return ResultVo.builder()
	                .result("true")
	                .resultMessage(resultMessage)
	                .data(data)
	                .build();
	 }
	 
	 
	
	
}
