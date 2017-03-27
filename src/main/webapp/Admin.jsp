<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery/jquery-1.4.min.js"></script>
    <%--<link href="bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>--%>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script>
        $(document).ready(function(){
          $("p").click(function(){
          $(this).hide();
          });
        });
    </script>
</head>

<body>
    <div class="container">
        <h2>学院</h2>
        <table class="table" id="table">
            <tr><td>名称</td><td>简称</td><td>操作</td></tr>
        </table>
    </div>

</body>
    <script>
        $(document).ready(function(){
            $.get("/school/all", function(data, status){
                for(var i=0; i<data.length; i++){
                    var tb = data[i];
                    $("#table").append("<tr><td>" + tb.name +"</td><td>"+tb.shortName
                    +"</td><td><button class='button' id='modify'>修改</button>"
                    +"<button class='button' id='delete'>删除</button>"
                    +"</td></tr>");
                }
            })
        });
    </script>
</html>
