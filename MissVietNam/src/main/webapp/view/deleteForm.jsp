<%--
  Created by IntelliJ IDEA.
  User: NguyenVanHuong
  Date: 9/28/20
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Deleting</title>
    <style>
        .message{
            color:green;
        }

        legend{
            font-weight: bolder;
            font-size: larger;
        }

        td{
            width: 300px;
            text-align: right;
        }

        input{
            width: 300px;
            margin-left: 20px;
        }

    </style>
</head>
<body>
    <h1>Deleting...</h1>
    <p>
        <a href="/listCandidates">Show all candidates</a>
    </p>
    <form method="post">
        <fieldset>
            <legend>Candidate information</legend>
            <table>
                <tr>
                    <td>Name</td>
                    <td>${requestScope["candidate"].getName()}</td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td>${requestScope["candidate"].getDob()}</td>
                </tr>
                <tr>
                    <td>Personal Code</td>
                    <td>${requestScope["candidate"].getPersonalCode()}</td>
                </tr>
                <tr>
                    <td>Height</td>
                    <td>${requestScope["candidate"].getHeight()}</td>
                </tr>
                <tr>
                    <td>Weight</td>
                    <td>${requestScope["candidate"].getWeight()}</td>
                </tr>
                <tr>
                    <td>Talent</td>
                    <td>${requestScope["candidate"].getTalent()}</td>
                </tr>
                <tr>
                    <td>Province</td>
                    <td>${requestScope["candidate"].getCode()}</td>
                </tr>
                <tr>
                    <td>Image</td>
                    <td>${requestScope["candidate"].getImage()}</td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Delete"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
