<%--
  Created by IntelliJ IDEA.
  User: NguyenVanHuong
  Date: 9/28/20
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Updating</title>
    <style>
        .message{
            color:green;
        }

        legend{
            font-weight: bolder;
            font-size: larger;
        }c

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
    <h1>Update Form</h1>
    <p>
        <a href="/listCandidates">Back to homepage</a>
    </p>
    <form method="post">
        <fieldset>
            <legend>Candidate's information</legend>
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" id="name" value="${requestScope['candidate'].getName()}"></td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td><input type="text" name="dob" id="dob" value="${requestScope['candidate'].getDob()}"></td>
                </tr>
                <tr>
                    <td>Personal Code</td>
                    <td><input type="text" name="personalCode" id="personalCode" value="${requestScope['candidate'].getPersonalCode()}"></td>
                </tr>
                <tr>
                    <td>Address 1</td>
                    <td><input type="text" name="address1" id="address1" value="${requestScope['candidate'].getAddress1()}"></td>
                </tr>
                <tr>
                    <td>Address 2</td>
                    <td><input type="text" name="address2" id="address2" value="${requestScope['candidate'].getAddress2()}"></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="text" name="mobile" id="mobile" value="${requestScope['candidate'].getMobile()}"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" id="email" value="${requestScope['candidate'].getEmail()}"></td>
                </tr>
                <tr>
                    <td>Ethnic</td>
                    <td><input type="text" name="ethnic" id="ethnic" value="${requestScope['candidate'].getEthnic()}"></td>
                </tr>
                <tr>
                    <td>Education</td>
                    <td><input type="text" name="education" id="education" value="${requestScope['candidate'].getEducation()}"></td>
                </tr>
                <tr>
                    <td>Job</td>
                    <td><input type="text" name="job" id="job" value="${requestScope['candidate'].getJob()}"></td>
                </tr>
                <tr>
                    <td>Address 3</td>
                    <td><input type="text" name="address3" id="address3"  value="${requestScope['candidate'].getAddress3()}"></td>
                </tr>
                <tr>
                    <td>Height</td>
                    <td><input type="text" name="height" id="height" value="${requestScope['candidate'].getHeight()}"></td>
                </tr>
                <tr>
                    <td>Weight</td>
                    <td><input type="text" name="weight" id="weight" value="${requestScope['candidate'].getWeight()}"></td>
                </tr>
                <tr>
                    <td>Talent</td>
                    <td><input type="text" name="talent" id="talent" value="${requestScope['candidate'].getTalent()}"></td>
                </tr>
                <tr>
                    <td>Code</td>
                    <td><input type="text" name="province" id="province" value="${requestScope['candidate'].getCode()}"></td>
                </tr>
                    <td>Image</td>
                    <td><input type="text" name="image" id="image" value="${requestScope['candidate'].getImage()}"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
