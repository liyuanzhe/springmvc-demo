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

        <%-- 教师列表 --%>
        <div id="teacher-list">
            <table class="table table-hover" id="teachertable">
                <tr><td style="display:none">id</td><td style="hidden:true">姓名</td><td>职称</td><td>评分</td><td>操作</td></tr>
            </table>
        </div>


        <div class="button" id="edit-teacher-button" style="padding:10px;">
            <button class="btn btn-default" onclick="editTeacher(null)">新建</button>
        </div>

        <div id="teacher-info-wall" hidden>
            <div class="panel panel-default">
                <div class="panel-heading">教师信息</div>
                <div class="panel-body">
                    <div class="teacher-info" style="float:left;">
                        <div style="float:left;padding:10px;overflow:hidden;">
                            <a><img id="main-pic" width="120" height="150px" src="http://www.cs.sjtu.edu.cn/Management/Upload/[User]7e86b00895014d46bc6219bf3042d262/2013122511125989nUY8y.jpg"></a>
                        </div>
                        <div style="padding:10px;float:left;">
                            <h4>姓名： <span id="teacher-name">李源哲</span></h4>
                            <p>职称: <span id="teacher-title">教授</span></p>
                            <p>院系：<span id="teacher-department">电信学院-计算机系</span></p>
                            <p>主页： <a id="teacher-url" href="http://www.baidu.com">www.baidu.com</a></p>
                        </div>
                    </div>
                    <div class="score" style="padding:10px;">
                        <p>评分: <span id="teacher-score">7.8</span></p>
                    </div>
                </div>
            </div>

            <%-- 评论列表--%>
            <div class="panel panel-default">
                <div class="panel-body">
                    <ul class="media-list" id="comment-list">
                        <li class="media">
                            <div class="media-left">
                                <a href="#">
                                    <img class="media-object" width="64px" heigth="64px" src="http://www.cs.sjtu.edu.cn/Management/Upload/[User]7e86b00895014d46bc6219bf3042d262/2013122511125989nUY8y.jpg" alt="...">
                                </a>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">Media heading</h4>
                                百日一闪饥荒何日还留
                                与穷潜力目
                                更上一层楼
                                处和日当无
                                汗地喝下图
                            </div>
                        </li>
                    </ul>
                    <div>
                        <input type="text" class="form-control" id="comment-score">
                        <textarea class="form-control" rows="3" id="comment-text"></textarea>
                        <button class="btn btn-default" id="btn-comment" type="submit" onclick="commitComment()">添加评价</button>
                    </div>
                </div>
            </div>
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
            <li>
                <label for="name">图片</label>
                <input type="text" class="form-control text-input" id="modal-img" placeholder="图片">
            </li>
            <li>
                <label for="name">主页</label>
                <input type="text" class="form-control text-input" id="modal-url" placeholder="主页">
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
        var teacher = {};

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
                listModel.append("<tr><td>id</td><td>姓名</td><td>职称</td><td>评分</td><td>操作</td></tr>");
                for(var i=0; i<data.length; i++){
                    listModel.append("<tr onclick='showTeacherInfo(this)'><td>" + data[i].id + "</td><td>" + data[i].name + "</td><td>" + data[i].title + "</td><td>" + data[i].score + "</td><td onclick='editTeacher(this)'><a href='#'>修改</a></td></tr>");
                }
            });

            $("#teachertable").show();
            $("#edit-teacher-button").show();
            $("#teacher-info-wall").hide();

        }

        var editTeacher = function(obj){
            // 获取teacherId
            var tds= $(obj).parent().find('td');
            var teacherId = tds.eq(0).text();
            var teacher = getTeacherById(teacherId);

            if(obj == null){
                $("#name").val("");
                $("#title").val("");
                $("#score").val("");
                $("#id").val("");
                $("#modal-img").val("");
                $("#modal-url").val("");
            }else{
                $("#name").val(teacher.name);
                $("#title").val(teacher.title);
                $("#score").val(teacher.score);
                $("#id").val(teacher.id);
                $("#modal-img").val(teacher.img);
                $("#modal-url").val(teacher.url);
            }

            $('#modal').modal('show');
        }

        var showTeacherInfo = function(obj){
            // 获取teacherId
            var tds= $(obj).find('td');
            var teacherId = tds.eq(0).text();
            teacher = getTeacherById(teacherId);

            $("#main-pic").attr("src", teacher.img);
            $("#teacher-department").text(teacher.departmentid);
            $("#teacher-url").attr("href", teacher.url);
            $("#teacher-url").text(teacher.url);
            $("#teacher-name").text(teacher.name);

            loadComment();
            // 隐藏teacher列表
            $("#teachertable").hide();
            $("#edit-teacher-button").hide();

            $("#teacher-info-wall").show();

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
            teacher.img = $("#modal-img").val();
            teacher.url = $("#modal-url").val();
            alert(teacher.img);
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
            teacher.img = $("#modal-img").val();
            teacher.url = $("#modal-url").val();
            teacher.departmentid = department.id;
            $.post("teacher/insert.do", teacher, function(data, status){
                listTeacher();
            });
        }

        var commitComment = function(){
            var score = $("#comment-score").val();
            var comment = $("#comment-text").val();

            if(score == "" || comment == "") return;

            $.post("comment/insert.do", {score:score, content:comment, userId:1, teacherId:teacher.id});

            loadComment();

            score = $("#comment-score").val("");
            comment = $("#comment-text").val("");
        }

        var createComment = function(comment){
            return (
            "<li class='media' style='padding:10px;border-bottom-style: solid;border-bottom-width: thin;border-bottom-color:lightgray'>" +
            "<div class='media-left'>" +
            "<a href='#'>" +
            "<img class='media-object' width='64px' heigth='64px' src=" + comment.url +"'>" +
            "</a></div><div class='media-body'>" +
            "<h4 class='media-heading'>评分： " +comment.score+ "</h4>" + comment.content +
            "</div></li>");
        }

        var loadComment = function(){
            // 请求评论
            var commentList = $("#comment-list");
            commentList.children().remove();
            $.get("comment/list.do?teacherId=" + teacher.id, function(data, status){
                for(var i=0; i<data.length; i++){
                    commentList.append(createComment(data[i]));
                }
            });
        }

        $(document).ready(function(){
        loadSchool();
        });
        </script>
        </body>
        </html>

