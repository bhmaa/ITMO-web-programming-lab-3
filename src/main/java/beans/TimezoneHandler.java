package beans;

import lombok.Getter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean(name = "timezoner")
@SessionScoped
public class TimezoneHandler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    private String timezone;

    public void setTimezone() {
        timezone = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("timezone");
    }
}
