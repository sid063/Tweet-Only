<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>
<s:form action="addTweet">
	<s:textfield name="username" label="User Name" />
	<s:textfield name="message" label="Enter Message" />
	<s:submit />
</s:form>

<s:if test="tweetList.size() > 0">
	<div class="content">
	<table class="userTable" cellpadding="5px">
		<tr class="even">
			<th>Name</th>
			<th>Message</th>
		</tr>
		<s:iterator value="tweetList" status="tweetStatus">
			<tr
				class="<s:if test="#tweetStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="username" /></td>
				<td><s:property value="message" /></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
</body>
</html>