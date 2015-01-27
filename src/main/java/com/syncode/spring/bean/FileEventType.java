package com.syncode.spring.bean;

public class FileEventType {
	private String eventType;
	private String description;
	
	private static FileEventType fileEvent = new FileEventType();
  

    public FileEventType() {
   	
	}

	public static FileEventType getInstance(){
    	return fileEvent;
    }

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result
				+ ((fileEvent == null) ? 0 : fileEvent.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileEventType other = (FileEventType) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		if (fileEvent == null) {
			if (other.fileEvent != null)
				return false;
		} else if (!fileEvent.equals(other.fileEvent))
			return false;
		return true;
	}
}
