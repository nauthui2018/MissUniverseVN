<%--
  Created by IntelliJ IDEA.
  User: NguyenVanHuong
  Date: 9/28/20
  Time: 1:35 PM
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
    <h1>Miss Universe Form</h1>
    <p>
        <c:if test="${requestScope['message'] != null}">
            <span class="message">${requestScope["message"]}</span>
        </c:if>
    </p>
    <p>
        <a href="/listCandidates">Show list candidates</a>
    </p>
    <p>
        <a href="/listQualifiers">Show list qualifiers</a>
    </p>
    <form method="post">
        <fieldset>
            <legend>Candidate information</legend>
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" id="name"></td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td><input type="text" name="dob" id="dob"></td>
                </tr>
                <tr>
                    <td>Personal Code</td>
                    <td><input type="text" name="personalCode" id="personalCode"></td>
                </tr>
                <tr>
                    <td>Address 1</td>
                    <td><input type="text" name="address1" id="address1"></td>
                </tr>
                <tr>
                    <td>Address 2</td>
                    <td><input type="text" name="address2" id="address2"></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="text" name="mobile" id="mobile"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" id="email"></td>
                </tr>
                <tr>
                    <td>Ethnic</td>
                    <td><input type="text" name="ethnic" id="ethnic"></td>
                </tr>
                <tr>
                    <td>Education</td>
                    <td><input type="text" name="education" id="education"></td>
                </tr>
                <tr>
                    <td>Job</td>
                    <td><input type="text" name="job" id="job"></td>
                </tr>
                <tr>
                    <td>Address 3</td>
                    <td><input type="text" name="address3" id="address3"></td>
                </tr>
                <tr>
                    <td>Height</td>
                    <td><input type="text" name="height" id="height"></td>
                </tr>
                <tr>
                    <td>Weight</td>
                    <td><input type="text" name="weight" id="weight"></td>
                </tr>
                <tr>
                    <td>Talent</td>
                    <td><input type="text" name="talent" id="talent"></td>
                </tr>
                <tr>
                    <td>Province</td>
                    <td><input type="text" name="province" id="province"></td>
                </tr>
                    <td>Image</td>
                    <td><input type="text" name="image" id="image"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Register" style="font-weight: bolder"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>


