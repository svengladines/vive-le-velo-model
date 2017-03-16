package be.occam.velo;

import java.util.Date;


public class RideDTO {
	
	protected String uuid;
	protected String title;
	protected Date moment;
	protected CoordinateDTO start;
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public CoordinateDTO getStart() {
		return start;
	}

	public void setStart(CoordinateDTO start) {
		this.start = start;
	}
	
}
