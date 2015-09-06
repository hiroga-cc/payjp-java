package jp.pay.exception;

public class CardException extends PayjpException {
	private static final long serialVersionUID = 1L;

	private String code;
	private String param;
	private String declineCode;
	private String charge;

	public CardException(String message, String code, String param, String declineCode, String charge, Throwable e) {
		super(message, e);
		this.code = code;
		this.param = param;
		this.declineCode = declineCode;
		this.charge = charge;
	}

	public String getCode() {
		return code;
	}
	public String getParam() {
		return param;
	}
	public String getDeclineCode() {
		return declineCode;
	}
	public String getCharge() {
		return charge;
	}
}
