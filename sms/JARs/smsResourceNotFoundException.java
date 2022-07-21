package net.javaguides.sms.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2413694996274812388L;
    private String resourceName;
    private String fieldName;
    private Object fieldValue;
	
    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("% not found with %a : '%s'", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}
    
    
    
    
}
