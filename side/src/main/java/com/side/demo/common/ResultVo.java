package com.side.demo.common;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
@Builder
public class ResultVo<T> {
	
	private String result;
	private String resultMessage;
	private T data;
	
	public ResultVo(String result, String resultMessage, T data) {
		
		this.result = result;
		this.resultMessage = resultMessage;
		this.data = data;
	}
	
}
