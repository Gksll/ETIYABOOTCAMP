package Kosgeb;


import java.util.*;

import Kosgeb.Entities.Applicant;
import Kosgeb.Entities.Application;
import Kosgeb.Entities.BankUser;
import Kosgeb.Entities.BlackList;
import Kosgeb.Entities.Credit;
import Kosgeb.Entities.CreditFeature;
import Kosgeb.Entities.Employee;
import Kosgeb.Entities.Feature;
import Kosgeb.Entities.State;
import Kosgeb.Entities.Title;
import Kosgeb.Entities.TitlePermission;

public class Main {

	public static void main(String[] args) {
		List<BlackList> blackLists = new ArrayList<>();
		List<Application> applications= new ArrayList<>();
		List<BankUser> bankUsers= new ArrayList<>();
		List<CreditFeature> creditFeatures= new ArrayList<>();
		List<Employee> employees= new ArrayList<>();
		List<TitlePermission> titlePermissions= new ArrayList<>();
		java.util.Date now = new java.util.Date();
		Applicant applicant1 = new Applicant(1,now, "12345", "34456", applications,blackLists);
		State state1 = new State(1, "başarılı");
		Credit credit1 = new Credit(1, "Erzurum Kredisi", now, state1, applications, creditFeatures);
		Application application = new Application(1, credit1,  applicant1,  state1);
		Title title = new Title(1,"Müdür",employees,titlePermissions);
		Feature feature1 = new Feature(1,"il","Erzurum",creditFeatures);
		CreditFeature creditFeature = new CreditFeature(1,credit1,feature1);
		applications.add(application);
		creditFeatures.add(creditFeature);
		creditFeatures.add(creditFeature);
		
		
		System.out.println(applicant1.getApplications().get(0).getCredit().getName());
		System.out.println(feature1.getCreditFeatures().get(1).getCredit().getState().getStateName());
		

	}

}
