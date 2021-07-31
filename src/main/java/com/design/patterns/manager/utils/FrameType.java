package com.design.patterns.manager.utils;

public enum FrameType {
	ADD,
	REMOVE,
	EXIST,
	LIST,
	CLOSE,
	ACK;

	public static FrameType parser(String message) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(message)) {
				return frameType;
			}
		}
		return null;
	}
}
