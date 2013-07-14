package com.accenture.servlets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import com.bmc.DAO.userInformation;
import com.bmc.DAO.users;


public class FirstServlets extends HttpServlet {
	users user= new users();	
	public void setUserData()
	{
		List<userInformation> userInfo = new ArrayList<userInformation>();
		userInfo.add(new userInformation("tien_dinh@bmc.com","jive6769","198.147.192.8",true,true,"Tinh","Dien","Lead Technology Specialist","BMC-SOFTWARE","213-361-5075","Obama History","http://www-scf.usc.edu/~arpitmit/arpit.html","Architecture ","06/06/1987","213-361-5075","arpitmit@usc.edu"));
		userInfo.add(new userInformation("arpitmittal@bmc.com","jive","198.147.192.10",false,false,"Arpit","Mittal","Intern","BMC-SOFTWARE","213-361-5075","Jungle","http://www-scf.usc.edu/~arpitmit/arpit1.html","Architecture1 ","06/06/1988","213-362-5075","arpitmit@usc1.edu"));
		user.setUserInfo(userInfo);
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		List<userInformation> userInfo = new ArrayList<userInformation>();
		int i=0;
		String userName=null,password=null,sourceIp=null;
		int flag=0;
		String match="Please enter again";
		String xml;
		
		res.setContentType("text/html");
		userName= req.getParameter("userName"); 
		password= req.getParameter("password"); 		
		sourceIp= req.getParameter("sourceIp");
		setUserData();
		if((userName=="")||(password=="")||(sourceIp=="")||(userName.equalsIgnoreCase(match))||(password.equalsIgnoreCase(match))||(sourceIp.equalsIgnoreCase(match)))
		{
			req.setAttribute("user_name", "Please enter again");
			req.setAttribute("pass_word", "Please enter again");
			req.setAttribute("source_Ip", "Please enter again");
		    req.getRequestDispatcher("loginGet.jsp").forward(req, res);
        }
		else if((userName!=null)&&(password!=null)&&(sourceIp!=null)&&(!userName.equalsIgnoreCase(match))&&(!password.equalsIgnoreCase(match))&&(!sourceIp.equalsIgnoreCase(match)))
		{
			userInfo=user.getUserInfo();
			
			for(i=0;i<userInfo.size();i++)// Iterate through all User Info
			{
				if((userInfo.get(i).getUsername().equalsIgnoreCase(userName))&&((userInfo.get(i).getPassword().equalsIgnoreCase(password)))&&((userInfo.get(i).getSourceIp().equalsIgnoreCase(sourceIp))))
						{
					     // Displaying Information in XML Format
					     System.out.println("Authentic User"+userInfo);
					     if(userInfo.get(i).isAuthenticated())
					     {
					      xml="<AuthenticationResponse xmlns:ns2=\"http://jivesoftware.com/authentication\"><authenticated>"+userInfo.get(i).isAuthenticated()+"</authenticated><disabled>"+userInfo.get(i).isDisabled()+"</disabled><profile><firstName>"+userInfo.get(i).getFirstName()+"</firstName><lastName>"+userInfo.get(i).getLastName()+"</lastName><occupation>"+userInfo.get(i).getOccupation()+"</occupation><company>"+userInfo.get(i).getCompany()+"</company><phonenumber>"+userInfo.get(i).getPhonenumber()+"</phonenumber><biography>"+userInfo.get(i).getBiography()+"</biography><url>"+userInfo.get(i).getUrl()+"</url><expertise>"+userInfo.get(i).getExpertise()+"</expertise><joindate>"+userInfo.get(i).getJoindate()+"</joindate><alternatephonenumber>"+userInfo.get(i).getAlternatephonenumber()+"</alternatephonenumber><email>"+userInfo.get(i).getAlternateemail()+"</email></profile></AuthenticationResponse>";
					     }
					     else
					     {
					      xml="<AuthenticationResponse xmlns:ns2=\"http://jivesoftware.com/authentication\"><authenticated>false</authenticated><disabled>"+userInfo.get(i).isDisabled()+"</disabled></AuthenticationResponse>";
						 }
					     req.setAttribute("xmlString", xml);
					     flag=1;// Authentic user
					     req.getRequestDispatcher("xmlDisplay.jsp").forward(req, res);
						}
			
			}
			if(flag==0)// Non Authentic user
			{
				// Displaying Information in XML Format
				 System.out.println("Non Authentic User"+userInfo);
				 xml="<AuthenticationResponse xmlns:ns2=\"http://jivesoftware.com/authentication\"><authenticated>false</authenticated></AuthenticationResponse>";
			     req.setAttribute("xmlString", xml);
			     req.getRequestDispatcher("xmlDisplay.jsp").forward(req, res);
				
			}
			
		}

		
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		List<userInformation> userInfo = new ArrayList<userInformation>();
		int i=0;
		String userName=null,password=null,sourceIp=null;
		int flag=0;
		String match="Please enter again";
		String xml;
		
		res.setContentType("text/html");
		userName= req.getParameter("userName"); 
		password= req.getParameter("password"); 		
		sourceIp= req.getParameter("sourceIp");
		setUserData();
		if((userName=="")||(password=="")||(sourceIp=="")||(userName.equalsIgnoreCase(match))||(password.equalsIgnoreCase(match))||(sourceIp.equalsIgnoreCase(match)))
		{
			req.setAttribute("user_name", "Please enter again");
			req.setAttribute("pass_word", "Please enter again");
			req.setAttribute("source_Ip", "Please enter again");
		    req.getRequestDispatcher("login.jsp").forward(req, res);
        }
		else if((userName!=null)&&(password!=null)&&(sourceIp!=null)&&(!userName.equalsIgnoreCase(match))&&(!password.equalsIgnoreCase(match))&&(!sourceIp.equalsIgnoreCase(match)))
		{
			userInfo=user.getUserInfo();
			
			for(i=0;i<userInfo.size();i++)// Iterate through all User Info
			{
				if((userInfo.get(i).getUsername().equalsIgnoreCase(userName))&&((userInfo.get(i).getPassword().equalsIgnoreCase(password)))&&((userInfo.get(i).getSourceIp().equalsIgnoreCase(sourceIp))))
						{
					     // Displaying Information in XML Format
					     System.out.println("Authentic User"+userInfo);
					     if(userInfo.get(i).isAuthenticated())
					     {
					      xml="<AuthenticationResponse xmlns:ns2=\"http://jivesoftware.com/authentication\"><authenticated>"+userInfo.get(i).isAuthenticated()+"</authenticated><disabled>"+userInfo.get(i).isDisabled()+"</disabled><profile><firstName>"+userInfo.get(i).getFirstName()+"</firstName><lastName>"+userInfo.get(i).getLastName()+"</lastName><occupation>"+userInfo.get(i).getOccupation()+"</occupation><company>"+userInfo.get(i).getCompany()+"</company><phonenumber>"+userInfo.get(i).getPhonenumber()+"</phonenumber><biography>"+userInfo.get(i).getBiography()+"</biography><url>"+userInfo.get(i).getUrl()+"</url><expertise>"+userInfo.get(i).getExpertise()+"</expertise><joindate>"+userInfo.get(i).getJoindate()+"</joindate><alternatephonenumber>"+userInfo.get(i).getAlternatephonenumber()+"</alternatephonenumber><email>"+userInfo.get(i).getAlternateemail()+"</email></profile></AuthenticationResponse>";
					     }
					     else
					     {
					      xml="<AuthenticationResponse xmlns:ns2=\"http://jivesoftware.com/authentication\"><authenticated>false</authenticated><disabled>"+userInfo.get(i).isDisabled()+"</disabled></AuthenticationResponse>";
						 }
					     req.setAttribute("xmlString", xml);
					     flag=1;// Authentic user
					     req.getRequestDispatcher("xmlDisplay.jsp").forward(req, res);
						}
			
			}
			if(flag==0)// Non Authentic user
			{
				// Displaying Information in XML Format
				 System.out.println("Non Authentic User"+userInfo);
				 xml="<AuthenticationResponse xmlns:ns2=\"http://jivesoftware.com/authentication\"><authenticated>false</authenticated></AuthenticationResponse>";
			     req.setAttribute("xmlString", xml);
			     req.getRequestDispatcher("xmlDisplay.jsp").forward(req, res);
				
			}
			
		}

		
		
	}

}
