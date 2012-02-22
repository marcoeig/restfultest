package at.eiglets.restfultest.domain;

import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlRootElement;

import org.joda.time.DateMidnight;
import org.springframework.format.annotation.DateTimeFormat;

@XmlRootElement
public class Campaign {

	private String name;
		
	@DateTimeFormat(pattern="dd.MM.yyyy")
	private DateMidnight from;
	private DateMidnight until;
	
	@Min(value =50)
	private Integer budgetTotal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public DateMidnight getFrom() {
		return from;
	}
	
	@DateTimeFormat(pattern="dd.MM.yyyy")
	public void setFrom(DateMidnight from) {
		this.from = from;
	}

	@DateTimeFormat(pattern="dd.MM.yyyy")
	public DateMidnight getUntil() {
		return until;
	}

	public void setUntil(DateMidnight until) {
		this.until = until;
	}

	public Integer getBudgetTotal() {
		return budgetTotal;
	}

	public void setBudgetTotal(Integer budgetTotal) {
		this.budgetTotal = budgetTotal;
	}
	
}
