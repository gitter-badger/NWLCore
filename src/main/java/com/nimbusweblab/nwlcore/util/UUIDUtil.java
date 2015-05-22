package com.nimbusweblab.nwlcore.util;

import java.util.UUID;

public class UUIDUtil {
	public final UUID getUUID(String player) {
		return UUID.fromString(player);
	}
	
	public final int getInt(String player) {
		String strUUID = UUID.fromString(player).toString();
		int intUUID = Integer.parseInt(strUUID);
		return intUUID;
	}
}
