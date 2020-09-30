<%--
  Created by IntelliJ IDEA.
  User: NguyenVanHuong
  Date: 9/28/20
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Qualifiers List</title>
    <style>
        table {
            border-collapse: collapse;
        }
        td {
            border: black solid 1px;
        }
    </style>
</head>
<body>
<h1>All qualifiers</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/listCandidates">Show all candidates</a>
</p>
<table>
    <tr>
        <td>No.</td>
        <td>Name</td>
        <td>DOB</td>
        <td>Personal Code</td>
        <td>Height</td>
        <td>Weight</td>
        <td>Talent</td>
        <td>Qualify</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${requestScope['qualifiers']}" var="candidate">
        <tr>
            <td>${qualifiers.indexOf(candidate)+1}</td>
            <td>${candidate.getName()}</td>
            <td>${candidate.getDob()}</td>
            <td>${candidate.getPersonalCode()}</td>
            <td>${candidate.getHeight()}</td>
            <td>${candidate.getWeight()}</td>
            <td>${candidate.getTalent()}</td>
            <td>${candidate.getQualify()}</td>
            <td><a href="/view?personalCode=${candidate.getPersonalCode()}">View Detail</a></td>
            <td><a href="/update?personalCode=${candidate.getPersonalCode()}">Update</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
