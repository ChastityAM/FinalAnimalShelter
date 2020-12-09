package com.cognixia.jump.constants;

public enum Crud {
	CREATE("INSERT INTO "	, " VALUES"),
	READ("SELECT * FROM "	," WHERE "),
	READ_ALL("SELECT * FROM "	," WHERE "),
	UPDATE("UPDATE "		," SET "), 
	DELETE("DELETE FROM "	," WHERE ");
	 
	private String prefix;
	private String nonpre;


	Crud(String prefix, String nonpre) {
		this.setPrefix(prefix);
		this.setNonpre(nonpre);
	}

	public String getPrefix() {
		return prefix;
	}

	private void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getNonpre() {
		return nonpre;
	}

	private void setNonpre(String nonpre) {
		this.nonpre = nonpre;
	}
}
