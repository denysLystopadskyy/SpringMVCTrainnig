<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>

    <title>Customer Reg Form</title>
    <style>
        .error {
            color: red
        }
    </style>

</head>
<body>
<h3>Fill out the form:</h3>
<br/>
<form:form action="processFrom" modelAttribute="customer">
    First Name:<form:input path="firstName"/>
    <br><br>

    Last Name (*):<form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>

    Free passes:<form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br><br>

    Course Code:<form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br><br>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>