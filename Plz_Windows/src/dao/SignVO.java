package dao;

public class SignVO {
	 
    private String m_id;
    
    private String m_pwd;
    
    private String m_name;
    
    private String m_birth;
    
    private String m_phone;

    private String m_email;

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pwd() {
		return m_pwd;
	}

	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_birth() {
		return m_birth;
	}

	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	@Override
	public String toString() {
		return "SignVO [m_id=" + m_id + ", m_pwd=" + m_pwd + ", m_name=" + m_name + ", m_birth=" + m_birth
				+ ", m_phone=" + m_phone + ", m_email=" + m_email + "]";
	}

    
}

