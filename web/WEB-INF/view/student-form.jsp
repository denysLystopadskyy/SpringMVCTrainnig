<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!Doctype html>

<html>
<head></head>
<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    Country:
    <form:select path="country">
        <form:options items="${student.countries}"/>
    </form:select>

    <br><br>

    Programming language:
    <form:radiobuttons path="programmingLanguage" items="${student.progLanguages}"/>
    <br><br>

    What OS are you using:
    <br><br>
    <form:checkbox path="os" value="MacOS" label="MacOS"/>
    <form:checkbox path="os" value="Linux" label="Linux"/>
    <form:checkbox path="os" value="Windows" label="Windows"/>

    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
