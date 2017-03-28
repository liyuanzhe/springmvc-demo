    <%@ page contentType="text/html;charset=UTF-8" %>
        <!doctype html>
        <html>
        <head>
        <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        </head>

        <body>

        <div class="container">

        <!-- 导航 -->
        <ul class="nav nav-pills">
        <li role="presentation" class="active"><a href="admin.jsp">Home</a></li>
        <li role="presentation"><a href="school.jsp">学院</a></li>
        <li role="presentation"><a href="department.jsp">系</a></li>
        </ul>

        <div style="padding:5px;"></div>

        <!-- 院系筛选-->
        <nav class="navbar navbar-default">
            <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">教师筛选</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

            <%--下拉列表--%>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" id="school-dropdown" onclick="loadSchool()" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">学院<span class="caret"></span></a>
                <ul class="dropdown-menu" id="schoollist">
                <li><a href="#">Action</a></li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" id="department-dropdown" onclick="listDepartment()" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">系<span class="caret"></span></a>
                <ul class="dropdown-menu" id="departmentlist">
                    <li><a href="#">Action</a></li>
                </ul>
            </li>

            </ul>
            <form class="navbar-form navbar-left">
            <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
            </form>
            </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <div>
            <table class="table table-hover" id="teachertable">
                <tr><td style="display:none">id</td><td style="hidden:true">姓名</td><td>职称</td><td>评分</td></tr>
            </table>
        </div>


        <div class="button" style="padding:10px;">
        <button class="btn btn-default" onclick="editTeacher(null)">新建</button>
        </div>

        <!--模态窗口 -->
        <div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
            </button>
            <h4 class="modal-title" id="myModalLabel">模态窗口</h4>
            </div>
            <div class="modal-body modal-li">
            <form>
            <ul>
            <li>
            <label for="name">名称</label>
            <input type="text" class="form-control text-input" id="name" placeholder="请输入姓名">
            </li>
            <li>
            <label for="name">职称</label>
            <input type="text" class="form-control text-input" id="title" placeholder="职称">
            </li>
            <li>
            <label for="name">id</label>
            <input type="text" class="form-control text-input" id="id" placeholder="id">
            </li>
            <li>
                <label for="name">评分</label>
                <input type="text" class="form-control text-input" id="score" placeholder="score">
            </li>
            <!-- <li>
            <label for="name">性别</label>
            <input type="radio" name="sex" id="man" value="男" style="margin-left:10px;"/>男
            <input type="radio" name="sex" id="women" value="女" style="margin-left:10px;"/>女
            </li> -->
            </ul>
            </form>
            </div>
            <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn-default"  onclick="update()" data-dismiss="modal">修改</button>
            <button type="button" class="btn btn-default"  onclick="insert()" data-dismiss="modal">新建</button>
            <button type="button" class="btn btn-default"  onclick="deleteTeacher()" data-dismiss="modal">删除</button>
            </div>
            </div>
            </div>
        </div>

        </div>

        <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script type="text/javascript">

        var schoolList = [
        {name:"机械与动力工程学院", short:"机械学院", id:1},
        {name:"电子信息与电气工程学院", short:"电信学院", id:2},
        {name:"船舶与建筑学院学院", short:"船建学院", id:3},
        {name:"安泰经济与管理学院", short:"安泰学院", id:4},
        ];

        // 系列表
        var departmentList = [
            {name:"计算机科学系",short:"计算机系",id:1},
            {name:"电力系统与电气工程系",short:"电气系",id:2},
            {name:"自动化巴拉巴拉系",short:"自动化系",id:3},
        ];

        // 教师列表
        var teacherList = {};

        var department = {};
        var school = {};

        // 请求并加载学院列表
        var loadSchool = function(){
            var list = $("#schoollist");
            list.children().remove();
            $.get("school/all.do", function(data, status){
            schoolList = data;
            for(var i=0; i<data.length; i++){
                var school = data[i];
                list.append("<li><a onclick='clickSchool(this)'>" + school.shortName+ "<span hidden='true'>" + school.id + "</span>" + "</a></li>");
                }
            });
        }

        var clickSchool = function(obj){
            var schoolId = $(obj).children('span').text();
            var dropdown = $("#school-dropdown");
            for(var i=0; i<schoolList.length; i++){
                if(schoolId == schoolList[i].id){
                    school = schoolList[i];
                }
            }
            dropdown.html(school.shortName + "<span class='caret'>");
            loadDepartment(schoolId);
        };

        var loadDepartment = function(schoolId){
            departmentList = $.get("department/getBySchoolId.do?schoolId="+schoolId, function(data, status){
                departmentList = data;
            });
        }

        var listDepartment = function(){
            var list = $("#departmentlist");
            list.children().remove();
            for(var i=0; i<departmentList.length; i++){
                var department = departmentList[i];
                list.append("<li><a onclick='clickDepartment(this)'>" + department.shortName+ "<span hidden='true'>" + department.id + "</span>" + "</a></li>");
            }
        }

        var clickDepartment = function(obj){
            var departmentId = $(obj).children('span').text();
            var dropdown = $("#department-dropdown");
            <%--var shortName = null;--%>
            for(var i=0; i<departmentList.length; i++){
                if(departmentId == departmentList[i].id){
                    department = departmentList[i];
                    <%--shortName = departmentList[i].shortName;--%>
                }
            }
            dropdown.html(department.shortName + "<span class='caret'>");
            // 未完待续
            listTeacher();
        }

        var listTeacher = function(){
            $.get("teacher/getByDepartmentId.do?departmentId=" + department.id, function(data, status){
                teacherList = data;
                var listModel = $("#teachertable");
                listModel.children().remove();
                listModel.append("<tr><td>id</td><td>姓名</td><td>职称</td><td>评分</td></tr>");
                for(var i=0; i<data.length; i++){
                    listModel.append("<tr onclick='editTeacher(this)'><td>" + data[i].id + "</td><td>" + data[i].name + "</td><td>" + data[i].title + "</td><td>" + data[i].score + "</td></tr>");
                }
            });
        }

        var editTeacher = function(obj){
            // 获取teacherId
            var tds= $(obj).find('td');
            var teacherId = tds.eq(0).text();
            var teacher = getTeacherById(teacherId);

            if(obj == null){
                $("#name").val("");
                $("#title").val("");
                $("#score").val("");
                $("#id").val("");
            }else{
                $("#name").val(teacher.name);
                $("#title").val(teacher.title);
                $("#score").val(teacher.score);
                $("#id").val(teacher.id);
            }

            $('#modal').modal('show');
        }

        var getTeacherById = function(teacherId){
            var teacher = null;
            for(var i=0; i<teacherList.length; i++){
                if(teacherId == teacherList[i].id){
                    teacher =  teacherList[i];
                }
            }
            return teacher;
        }
        //提交更改
        function update() {
            //获取模态框数据
            var teacher = {};
            teacher.name = $('#name').val();
            teacher.title = $('#title').val();
            teacher.id = $('#id').val();
            teacher.score = $("#score").val();
            $.post("teacher/update.do", teacher, function(data, status){
                listTeacher();
            });
        }

        function deleteTeacher(){
            var id = $('#id').val();
            $.get("teacher/delete.do?id="+id, function(data, status){
                listTeacher();
            });
        }

        function insert(){
            //获取模态框数据
            var teacher = {};
            teacher.name = $('#name').val();
            teacher.score = $("#score").val();
            teacher.title = $("#title").val();
            teacher.departmentid = department.id;
            $.post("teacher/insert.do", teacher, function(data, status){
                listTeacher();
            });
        }

        $(document).ready(function(){
        loadSchool();
        });
        </script>
        </body>
        </html>

