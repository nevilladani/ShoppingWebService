<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleDBServiceProxyid" scope="session" class="dbService.DBServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleDBServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleDBServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleDBServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        dbService.DBService getDBService10mtemp = sampleDBServiceProxyid.getDBService();
if(getDBService10mtemp == null){
%>
<%=getDBService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String name_1id=  request.getParameter("name18");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String[] getName15mtemp = sampleDBServiceProxyid.getName(name_1idTemp);
if(getName15mtemp == null){
%>
<%=getName15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getName15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getName15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 20:
        gotMethod = true;
        java.lang.String[] getAll20mtemp = sampleDBServiceProxyid.getAll();
if(getAll20mtemp == null){
%>
<%=getAll20mtemp %>
<%
}else{
        String tempreturnp21 = null;
        if(getAll20mtemp != null){
        java.util.List listreturnp21= java.util.Arrays.asList(getAll20mtemp);
        tempreturnp21 = listreturnp21.toString();
        }
        %>
        <%=tempreturnp21%>
        <%
}
break;
case 23:
        gotMethod = true;
        String userid_2id=  request.getParameter("userid26");
            java.lang.String userid_2idTemp = null;
        if(!userid_2id.equals("")){
         userid_2idTemp  = userid_2id;
        }
        String pass_3id=  request.getParameter("pass28");
            java.lang.String pass_3idTemp = null;
        if(!pass_3id.equals("")){
         pass_3idTemp  = pass_3id;
        }
        java.lang.String login23mtemp = sampleDBServiceProxyid.login(userid_2idTemp,pass_3idTemp);
if(login23mtemp == null){
%>
<%=login23mtemp %>
<%
}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(login23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
}
break;
case 30:
        gotMethod = true;
        String userid_4id=  request.getParameter("userid33");
            java.lang.String userid_4idTemp = null;
        if(!userid_4id.equals("")){
         userid_4idTemp  = userid_4id;
        }
        java.lang.String userData30mtemp = sampleDBServiceProxyid.userData(userid_4idTemp);
if(userData30mtemp == null){
%>
<%=userData30mtemp %>
<%
}else{
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(userData30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
}
break;
case 35:
        gotMethod = true;
        String brand_5id=  request.getParameter("brand38");
            java.lang.String brand_5idTemp = null;
        if(!brand_5id.equals("")){
         brand_5idTemp  = brand_5id;
        }
        java.lang.String[] getBrand35mtemp = sampleDBServiceProxyid.getBrand(brand_5idTemp);
if(getBrand35mtemp == null){
%>
<%=getBrand35mtemp %>
<%
}else{
        String tempreturnp36 = null;
        if(getBrand35mtemp != null){
        java.util.List listreturnp36= java.util.Arrays.asList(getBrand35mtemp);
        tempreturnp36 = listreturnp36.toString();
        }
        %>
        <%=tempreturnp36%>
        <%
}
break;
case 40:
        gotMethod = true;
        String name_6id=  request.getParameter("name43");
            java.lang.String name_6idTemp = null;
        if(!name_6id.equals("")){
         name_6idTemp  = name_6id;
        }
        java.lang.String sayHelloWorld40mtemp = sampleDBServiceProxyid.sayHelloWorld(name_6idTemp);
if(sayHelloWorld40mtemp == null){
%>
<%=sayHelloWorld40mtemp %>
<%
}else{
        String tempResultreturnp41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHelloWorld40mtemp));
        %>
        <%= tempResultreturnp41 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>