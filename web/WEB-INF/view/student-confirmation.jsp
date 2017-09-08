<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">

<html>

<head>

    <title>Student Confirmation</title>

</head>

<br>

The student info: ${student.firstName} ${student.lastName}
</br>
Country: ${student.country}
<br>
Language: ${student.programmingLanguage}
<br>
OS:
<br>

<ul>
    <c:forEach var="temp" items="${student.os}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>

</html>