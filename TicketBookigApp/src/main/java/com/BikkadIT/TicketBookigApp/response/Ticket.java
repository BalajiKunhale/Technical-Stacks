package com.BikkadIT.TicketBookigApp.response;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Ticket {

	private int tid;

	private String pnr;

	private String tstatus;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTstatus() {
		return tstatus;
	}

	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", pnr=" + pnr + ", tstatus=" + tstatus + "]";
	}
}