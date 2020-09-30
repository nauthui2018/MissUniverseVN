<%--
  Created by IntelliJ IDEA.
  User: NguyenVanHuong
  Date: 9/28/20
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registering</title>
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
    <h1>Qualify Site</h1>
    <p>
        <a href="/listQualifiers">Show all qualifiers</a>
    </p>
    <p>
        <a href="/listCandidates">Show all candidates</a>
    </p>
    <form method="post">
        <fieldset>
            <legend>Candidate's information</legend>
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
                    <td>Address 1</td>
                    <td>${requestScope["candidate"].getAddress1()}</td>
                </tr>
                <tr>
                    <td>Address 2</td>
                    <td>${requestScope["candidate"].getAddress2()}</td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td>${requestScope["candidate"].getMobile()}</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>${requestScope["candidate"].getEmail()}</td>
                </tr>
                <tr>
                    <td>Ethnic</td>
                    <td>${requestScope["candidate"].getEthnic()}</td>
                </tr>
                <tr>
                    <td>Education</td>
                    <td>${requestScope["candidate"].getEducation()}</td>
                </tr>
                <tr>
                    <td>Job</td>
                    <td>${requestScope["candidate"].getJob()}</td>
                </tr>
                <tr>
                    <td>Address 3</td>
                    <td>${requestScope["candidate"].getJob()}</td>
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
                    <td>Code</td>
                    <td>${requestScope["candidate"].getCode()}</td>
                </tr>
                <tr>
                    <td>Image</td>
                    <td>${requestScope["candidate"].getImage()}</td>
                </tr>
                <tr>
                    <td>Result</td>
                    <td>
                        <input type="text" name="qualify" id="qualify" value="${requestScope['candidate'].getQualify()}">
                        <input type="hidden" name="personalCode" value="${requestScope['candidate'].getPersonalCode()}">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Qualify"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
