package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ReSourceNotFound extends RuntimeException {
	private String resourseName;  //employee
	private String fieldName;   // id
	private Object fieldValue;  //8


	public ReSourceNotFound(String resourseName, String fieldName, Object fieldValue) {
		super(resourseName+"Not found"+fieldName+":"+fieldValue);
		this.resourseName = resourseName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
}
