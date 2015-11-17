package org.apache.jsp.WEB_002dINF.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authorize_access;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authentication_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sec_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sec_authentication_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sec_authorize_access.release();
    _jspx_tagPool_c_url_var_value_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_sec_authentication_property_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"_csrf\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t<!-- default header name is X-CSRF-TOKEN -->\r\n");
      out.write("\t<meta name=\"_csrf_header\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.headerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t<!-- ... -->\r\n");
      out.write("  <title>TMS | New Member Form</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  <!-- Bootstrap 3.3.5 -->\r\n");
      out.write("  <!--Favicon Image -->\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("  <!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("  <!-- Morris chart -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("  <!-- jvectormap -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("  <!-- Date Picker -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("  <!-- Daterange picker -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_8(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("  <!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_url_9(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write(" \r\n");
      out.write("  <script src=\"http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("  <script src=\"//ajax.googleapis.com/ajax/libs/angularjs/1.5.0-beta.1/angular.min.js\"></script>\r\n");
      out.write("  <script> \r\n");
      out.write("   // $(function(){\r\n");
      out.write("    //$(\"#topSideFrame\").load(\"");
      if (_jspx_meth_c_url_10(_jspx_page_context))
        return;
      out.write("\"); \r\n");
      out.write("    //console.log(principal);\r\n");
      out.write("   //});\r\n");
      out.write("   </script> \r\n");
      out.write("   <style>\r\n");
      out.write("   .clearAll{\r\n");
      out.write("   clear: both;\r\n");
      out.write("   }\r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\" ng-app='Tms'  ng-controller='MasterController'>\r\n");
      if (_jspx_meth_sec_authorize_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"index2.html\" class=\"logo\">\r\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("      <span class=\"logo-mini\"><b>TMS</b></span>\r\n");
      out.write("      <!-- logo for regular state and mobile devices -->\r\n");
      out.write("      <span class=\"logo-lg\"><b>TMS</b>Panel</span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("      <!-- Sidebar toggle button-->\r\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"navbar-custom-menu\">\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("          \r\n");
      out.write("          <!-- User Account: style can be found in dropdown.less -->\r\n");
      out.write("          <li class=\"dropdown user user-menu\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("              <img src=\"");
      if (_jspx_meth_c_url_11(_jspx_page_context))
        return;
      out.write("\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("              <span class=\"hidden-xs\">");
      if (_jspx_meth_sec_authentication_0(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("              <!-- User image -->\r\n");
      out.write("              <li class=\"user-header\">\r\n");
      out.write("                <img src=\"");
      if (_jspx_meth_c_url_12(_jspx_page_context))
        return;
      out.write("\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("\r\n");
      out.write("                <p>\r\n");
      out.write("                 ");
      if (_jspx_meth_sec_authentication_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  <small>Member since July. 2013</small>\r\n");
      out.write("                </p>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- Menu Footer-->\r\n");
      out.write("              <li class=\"user-footer\">\r\n");
      out.write("                <div class=\"pull-left\">\r\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pull-right\">\r\n");
      out.write("                \t");
      if (_jspx_meth_c_url_13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t               <form id=\"logout\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Signout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\" >\r\n");
      out.write("\t\t\t\t\t  <input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!-- Control Sidebar Toggle Button -->\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i></a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\t\r\n");
      out.write("  </header>\r\n");
      out.write("  <input type=\"hidden\" value=\"");
      if (_jspx_meth_sec_authentication_2(_jspx_page_context))
        return;
      out.write("\" id=\"employeeId\">\r\n");
      out.write("  <div id='topSideFrame' ng-include=\"'assets/topSideFrame.html'\"> </div>\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <section class=\"content-header\">\r\n");
      out.write("      <h1>\r\n");
      out.write("        Dashboard\r\n");
      out.write("        <small>Control panel</small>\r\n");
      out.write("      </h1>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("      <!-- Small boxes (Stat box) -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("          <!-- small box -->\r\n");
      out.write("          <div class=\"small-box bg-aqua\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("              <p>You are in</p>\r\n");
      out.write("\t\t\t  <h3>3</h3>\r\n");
      out.write("\r\n");
      out.write("              <p>Teams</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"icon\">\r\n");
      out.write("              <i class=\"ion ion-person-stalker\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"#\" class=\"small-box-footer\">Team info <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ./col -->\r\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("          <!-- small box -->\r\n");
      out.write("          <div class=\"small-box bg-green\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("              <p>You Lead</p>\r\n");
      out.write("              <h3>1</h3>\r\n");
      out.write("\r\n");
      out.write("              <p>Team</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"icon\">\r\n");
      out.write("              <i class=\"ion ion-ribbon-b\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ./col -->\r\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("          <!-- small box -->\r\n");
      out.write("          <div class=\"small-box bg-yellow\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("              <p>You Work for</p>\r\n");
      out.write("              <h3>2</h3>\r\n");
      out.write("\r\n");
      out.write("              <p>Clients</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"icon\">\r\n");
      out.write("              <i class=\"ion ion-thumbsup\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ./col -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ./col -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("      \t<section ng-show=\"showNewMember()\" class=\"col-lg-12 connectedSortable\">\r\n");
      out.write("      \t<div class=\"box box-success\">\r\n");
      out.write("            <div class=\"box-header\">\r\n");
      out.write("            \t<i class=\"ion ion-person-add\"></i>\r\n");
      out.write("\t\t\t   <h3 class=\"box-title\">New Member</h3>\r\n");
      out.write("\t\t\t    <div class=\"box-body\">\r\n");
      out.write("\t\t\t    \t<form name=\"newMemberForm\" ng-submit=\"submitMemberForm()\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"firstName\" class=\"form-control\" placeholder=\"First Name*\" ng-model=\"newMember.firstName\" ng-pattern=\"/^[a-zA-Z]+$/\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"middleName\" class=\"form-control\" placeholder=\"Middle Name\" ng-model=\"newMember.middleName\" ng-pattern=\"/^[a-zA-Z]+$/\">\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"lastName\" class=\"form-control\" placeholder=\"Last Name*\" ng-model=\"newMember.lastName\" ng-pattern=\"/^[a-zA-Z]+$/\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newMemberForm.$submitted || newMemberForm.firstName.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newMemberForm.firstName.$error.required\">Please Fill First Name.</span>\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newMemberForm.firstName.$error.pattern\">Only letters are Allowed.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<div ng-show=\"newMemberForm.$submitted || newMemberForm.middleName.$touched\">\r\n");
      out.write("\t\t                  \t\t <span style=\"color: red\" ng-show=\"newMember.middleName.$error.pattern\">Only letters are Allowed.</span>\r\n");
      out.write("\t\t                  \t\t</div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t <span style=\"color:red\" ng-show=\"newMemberForm.lastName.$submitted || newMemberForm.lastName.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newMemberForm.lastName.$error.required\">Last Name is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newMemberForm.lastName.$error.pattern\">Only letters are allowed.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"userName\" class=\"form-control\" placeholder=\"User Name*\" ng-model=\"newMember.employeeUserName\" ng-minlength=\"5\" ng-maxlength=\"15\"  required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"email\" name=\"officialMail\" class=\"form-control\" placeholder=\"Official MailID*\" ng-model=\"newMember.officialEmailID\" required email>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"email\" name=\"permanentMail\" class=\"form-control\" placeholder=\"Personal MailID\" ng-model=\"newMember.permanentEmailID\" required email>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.userName.$submitted || newMemberForm.userName.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newMemberForm.userName.$error.required\">UserName is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newMemberForm.userName.$error.minlength\">UserName Must have length of 5.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newMemberForm.userName.$error.maxlength\">Max Length of UserName allowed 15.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.officialMail.$submitted || newMemberForm.officialMail.$touched\">\r\n");
      out.write("\t\t                  \t\t\t<span ng-show=\"newMemberForm.officialMail.$error.required\">OfficialMail Id is required.</span>\r\n");
      out.write("\t\t                  \t\t\t<span ng-show=\"newMemberForm.officialMail.$error.email\">Email ID should be valid.</span> \r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.permanentMail.$submitted || newMemberForm.permanentMail.$touched\">\r\n");
      out.write("\t\t                  \t\t\t<span ng-show=\"newMemberForm.permanentMail.$error.email\">Email ID should be valid.</span>\r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password*\" ng-model=\"newMember.password\" ng-minlength=\"5\" ng-maxlength=\"12\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" max=\"10\" name=\"homePhone\" class=\"form-control\" placeholder=\"Home Contact Number\" ng-model=\"newMember.homeNumber\" ng-pattern=\"/^\\d{10}$/\">\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" max=\"10\" name=\"officialPhone\" class=\"form-control\" placeholder=\"Official Contact Number*\" ng-model=\"newMember.officeNumber\" ng-pattern=\"/^\\d{10}$/\" ng-minlength=\"10\" ng-maxlength=\"10\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.password.$submitted ||newMemberForm.password.$touched\">\r\n");
      out.write("\t\t                  \t\t \t<span ng-show=\"newMemberForm.password.$error.required\">Password Required</span>\r\n");
      out.write("\t\t                  \t\t \t<span ng-show=\"newMemberForm.password.$error.minlength\">Password Must be of length 5</span>\r\n");
      out.write("\t\t                  \t\t \t<span ng-show=\"newMemberForm.password.$error.maxlength\">Password Should not exceed length 12</span>\r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.homePhone.$submitted || newMemberForm.homePhone.$touched\">\r\n");
      out.write("\t\t                  \t\t\t<span ng-show=\"newMemberForm.homePhone.$error.pattern\">Phone number is invalid.</span>\r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    \t\t<span style=\"color:red\" ng-show=\"newMemberForm.officialPhone.$submitted || newMemberForm.officialPhone.$touched\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span ng-show=\"newMemberForm.officialPhone.$error.required\">Official Number is required.</span>\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span ng-show=\"newMemberForm.officialPhone.$error.pattern\">Official Phone number is invalid.</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<textarea name=\"presentAddress\" class=\"form-control\" placeholder=\"Present Address*\"  ng-model=\"newMember.presentAdd\" required></textarea>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<textarea name=\"permanentAddress\" class=\"form-control\" placeholder=\"Permanent Address*\" ng-model=\"newMember.permanentAdd\"  required></textarea>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\tPresent Address same as permanent Address: <input type=\"checkbox\" ng-model=\"bothSame\" name=\"bothSame\"  ng-click=\"makeBothSame()\">\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.presentAddress.$submitted || newMemberForm.presentAddress.$touched\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span ng-show=\"newMemberForm.presentAddress.$error.required\">Present Address is required.</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.permanentAddress.$submitted || newMemberForm.permanentAddress.$touched\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span ng-show=\"newMemberForm.permanentAddress.$error.required\">Present Address is required.</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"skills\" class=\"form-control\" placeholder=\"Skills*\" ng-model=\"newMember.skills\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newMemberForm.skills.$submitted || newMemberForm.skills.$touched\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span ng-show=\"newMemberForm.skills.$error.required\">Skills Are Required.</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <input type=\"hidden\" id='csrf' name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"><button type=\"submit\" class=\"btn btn-default pull-right\">Add Profile</button></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t     <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\"> {{error}}{{success}}</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t     </form>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("           \t </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      \t</section>\r\n");
      out.write("      \t<section ng-show=\"showNewTeamMember()\" class=\"col-lg-12 connectedSortable\">\r\n");
      out.write("      \t\t<div class=\"box box-success\">\r\n");
      out.write("            <div class=\"box-header\">\r\n");
      out.write("            \t<i class=\"ion ion-person-add\"></i>\r\n");
      out.write("\t\t\t   <h3 class=\"box-title\">New Team Member</h3>\r\n");
      out.write("\t\t\t    <div class=\"box-body\">\r\n");
      out.write("\t\t\t    \t<form name=\"newTeamMemberForm\" ng-submit=\"submitTeamMemberForm()\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\tProject List:&nbsp;&nbsp;<select  name=\"selectedProject\" ng-model=\"newTeamMember.selectedProject\"  ng-change='selctedProject(newTeamMember.selectedProject)' required>\r\n");
      out.write("\t\t\t\t\t    \t\t <option ng-repeat=\"p in projects\" value={{p.projectId}}>{{p.projectName}}</option>\t\r\n");
      out.write("\t\t\t\t\t    \t\t</select>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\tMember List:&nbsp;&nbsp;<select  name=\"selectedMember\" ng-model=\"newTeamMember.selectedMember\"  ng-change='selctedProject(newTeamMember.selectedMember)' required>\r\n");
      out.write("\t\t\t\t\t    \t\t <option ng-repeat=\"m in members\" value={{m.accountId}}>{{m.employeeUserName}}</option>\t\r\n");
      out.write("\t\t\t\t\t    \t\t</select>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newTeamMemberForm.$submitted || newTeamMemberForm.selectedProject.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newTeamMember.selectedProject == 0\">Please Select a Project.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<div ng-show=\"newTeamMemberForm.$submitted || newTeamMemberForm.selectedMember.$touched\">\r\n");
      out.write("\t\t                  \t\t <span style=\"color: red\" ng-show=\"newTeamMember.selectedMember == 0\">Please Select a Member.</span>\r\n");
      out.write("\t\t                  \t\t</div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <input type=\"hidden\" id='csrf' name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"><button type=\"submit\" class=\"btn btn-default pull-right\">Assign Project</button></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t     </form>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("           \t </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      \t</section>\r\n");
      out.write("      \t<section ng-show=\"showNewProject()\" class=\"col-lg-12 connectedSortable\">\r\n");
      out.write("      \t\t<div class=\"box box-success\">\r\n");
      out.write("            <div class=\"box-header\">\r\n");
      out.write("            \t<i class=\"ion ion-monitor\"></i>\r\n");
      out.write("\t\t\t   <h3 class=\"box-title\">New Project</h3>\r\n");
      out.write("\t\t\t    <div class=\"box-body\">\r\n");
      out.write("\t\t\t    \t<form name=\"newProjectForm\" ng-submit=\"submitNewProjectForm()\" >\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"projectName\" class=\"form-control\" placeholder=\"project Name\" ng-model=\"newProject.projectName\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    \tClient:\r\n");
      out.write("\t\t\t\t\t    \t\t<select  name=\"selectedClient\" ng-model=\"newProject.selectedClient\"  ng-change='selctedClient(newProject.selectedClient)' required>\r\n");
      out.write("\t\t\t\t\t    \t\t <option ng-repeat=\"c in clients\" value={{c.clientId}}>{{c.clientName}}</option>\t\r\n");
      out.write("\t\t\t\t\t    \t\t</select>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.projectName.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newProjectForm.projectName.$error.required\">Please Fill Name of Project.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t               \t<!-- -->\r\n");
      out.write("\t\t               \t<div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.selectedClient.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newProject.selectedClient == 0\" >Please Select Client.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div> \r\n");
      out.write("\t\t               \t<div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    \t\t<textarea name=\"details\" class=\"form-control\" placeholder=\"Project Details*\"  ng-model=\"newProject.details\" required></textarea>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    \t\t<textarea name=\"description\" class=\"form-control\" placeholder=\"Project Description*\"  ng-model=\"newProject.description\" required></textarea>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.details.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newProjectForm.details.$error.required\">Please Fill Details of Project.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.description.$touched\">\r\n");
      out.write("\t\t                  \t\t <span style=\"color: red\" ng-show=\"newProjectForm.description.$error.required\">Please Fill Project Description.</span>\r\n");
      out.write("\t\t                  \t\t</div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"serverTechnologies\" class=\"form-control\" placeholder=\"Server Technologies*\" ng-model=\"newProject.serverTechnologies\"  required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"uiTechnologies\" class=\"form-control\" placeholder=\"UI Technologies*\" ng-model=\"newProject.uiTechnologies\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"database\" class=\"form-control\" placeholder=\"Database\" ng-model=\"newProject.database\">\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.$submitted || newProjectForm.serverTechnologies.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newProjectForm.serverTechnologies.$error.required\">Server Technologies is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.$submitted || newProjectForm.uiTechnologies.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newProjectForm.uiTechnologies.$error.required\">UI Technologies is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\tStart Date:&nbsp;<input type=\"date\" name=\"startDate\" class=\"form-control\" placeholder=\"Start Date*\" ng-model=\"newProject.startDate\" ng-change='selctedStartDate(newProject.startDate)'  placeholder=\"dd-MM-yyyy\" min=\"newProject.startDate\" max=\"31-12-2017\" required />\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\tDelivery Date:&nbsp;<input type=\"date\" name=\"deliveryDate\" class=\"form-control\" placeholder=\"Delivery Date*\" ng-model=\"newProject.deliveryDate\"  placeholder=\"dd-MM-yyyy\" min=\"newProject.startDate\" max=\"31-12-2021\" required />\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.startDate.$submitted ||newProjectForm.startDate.$touched\">\r\n");
      out.write("\t\t                  \t\t \t<span ng-show=\"newProjectForm.startDate.$error.required\">Start Date Required.</span>\r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.deliveryDate.$submitted ||newProjectForm.deliveryDate.$touched\">\r\n");
      out.write("\t\t                  \t\t \t<span ng-show=\"newProjectForm.deliveryDate.$error.required\">Delivery Date Required.</span>\r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <input type=\"hidden\" id='csrf' name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\t    \r\n");
      out.write("\t\t\t\t\t   <div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"><button type=\"submit\" class=\"btn btn-default pull-right\">Add Project</button></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t     </form>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("           \t </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      \t</section>\r\n");
      out.write("      \t<section ng-show=\"showNewClient()\" class=\"col-lg-12 connectedSortable\">\r\n");
      out.write("      \t\t<div class=\"box box-success\">\r\n");
      out.write("            <div class=\"box-header\">\r\n");
      out.write("            \t<i class=\"ion ion-monitor\"></i>\r\n");
      out.write("\t\t\t   <h3 class=\"box-title\">New Client</h3>\r\n");
      out.write("\t\t\t    <div class=\"box-body\">\r\n");
      out.write("\t\t\t    \t<form name=\"newClientForm\" ng-submit=\"submitNewClientForm()\" >\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"clientName\" class=\"form-control\" placeholder=\"project Name\" ng-model=\"newClient.clientName\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    \t\t<input type=\"text\" name=\"location\" class=\"form-control\" placeholder=\"Location\" ng-model=\"newClient.location\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.projectName.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newProjectForm.projectName.$error.required\">Please Fill Name of Project.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t               \t<!-- -->\r\n");
      out.write("\t\t               \t<div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.selectedClient.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newProject.selectedClient == 0\" >Please Select Client.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div> \r\n");
      out.write("\t\t               \t<div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    \t\t<textarea name=\"details\" class=\"form-control\" placeholder=\"Project Details*\"  ng-model=\"newProject.details\" required></textarea>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t    \t\t<textarea name=\"description\" class=\"form-control\" placeholder=\"Project Description*\"  ng-model=\"newProject.description\" required></textarea>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.details.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t      <span style=\"color:red\" ng-show=\"newProjectForm.details.$error.required\">Please Fill Details of Project.</span>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<div ng-show=\"newProjectForm.$submitted || newProjectForm.description.$touched\">\r\n");
      out.write("\t\t                  \t\t <span style=\"color: red\" ng-show=\"newProjectForm.description.$error.required\">Please Fill Project Description.</span>\r\n");
      out.write("\t\t                  \t\t</div>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"serverTechnologies\" class=\"form-control\" placeholder=\"Server Technologies*\" ng-model=\"newProject.serverTechnologies\"  required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"uiTechnologies\" class=\"form-control\" placeholder=\"UI Technologies*\" ng-model=\"newProject.uiTechnologies\" required>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<input type=\"text\" name=\"database\" class=\"form-control\" placeholder=\"Database\" ng-model=\"newProject.database\">\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.$submitted || newProjectForm.serverTechnologies.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newProjectForm.serverTechnologies.$error.required\">Server Technologies is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.$submitted || newProjectForm.uiTechnologies.$touched\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span ng-show=\"newProjectForm.uiTechnologies.$error.required\">UI Technologies is required.</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\tStart Date:&nbsp;<input type=\"date\" name=\"startDate\" class=\"form-control\" placeholder=\"Start Date*\" ng-model=\"newProject.startDate\" ng-change='selctedStartDate(newProject.startDate)'  placeholder=\"dd-MM-yyyy\" min=\"newProject.startDate\" max=\"31-12-2017\" required />\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\tDelivery Date:&nbsp;<input type=\"date\" name=\"deliveryDate\" class=\"form-control\" placeholder=\"Delivery Date*\" ng-model=\"newProject.deliveryDate\"  placeholder=\"dd-MM-yyyy\" min=\"newProject.startDate\" max=\"31-12-2021\" required />\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-4\"> \r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.startDate.$submitted ||newProjectForm.startDate.$touched\">\r\n");
      out.write("\t\t                  \t\t \t<span ng-show=\"newProjectForm.startDate.$error.required\">Start Date Required.</span>\r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t               \t</div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"form-group\">\r\n");
      out.write("\t\t                  \t\t<span style=\"color:red\" ng-show=\"newProjectForm.deliveryDate.$submitted ||newProjectForm.deliveryDate.$touched\">\r\n");
      out.write("\t\t                  \t\t \t<span ng-show=\"newProjectForm.deliveryDate.$error.required\">Delivery Date Required.</span>\r\n");
      out.write("\t\t                  \t\t</span>\r\n");
      out.write("\t\t               \t\t </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    <input type=\"hidden\" id='csrf' name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t    <div class=\"clearAll\"></div>\t    \r\n");
      out.write("\t\t\t\t\t   <div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"><button type=\"submit\" class=\"btn btn-default pull-right\">Add Project</button></div>\r\n");
      out.write("\t\t\t\t\t     <div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t     </form>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("           \t </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t</section>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Main row -->\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <!-- Left col -->\r\n");
      out.write("        <section class=\"col-lg-7 connectedSortable\">\r\n");
      out.write("         <!-- TO DO List -->\r\n");
      out.write("          <div class=\"box box-primary\">\r\n");
      out.write("            <div class=\"box-header\">\r\n");
      out.write("              <i class=\"ion ion-clipboard\"></i>\r\n");
      out.write("\r\n");
      out.write("              <h3 class=\"box-title\">Task List</h3>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"box-tools pull-right\">\r\n");
      out.write("                <ul class=\"pagination pagination-sm inline\">\r\n");
      out.write("                  <li><a href=\"#\">&laquo;</a></li>\r\n");
      out.write("                  <li><a href=\"#\">1</a></li>\r\n");
      out.write("                  <li><a href=\"#\">2</a></li>\r\n");
      out.write("                  <li><a href=\"#\">3</a></li>\r\n");
      out.write("                  <li><a href=\"#\">&raquo;</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-header -->\r\n");
      out.write("            <div class=\"box-body\">\r\n");
      out.write("              <ul class=\"todo-list\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <!-- drag handle -->\r\n");
      out.write("                      <span class=\"handle\">\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                  <!-- checkbox -->\r\n");
      out.write("                  <input type=\"checkbox\" value=\"\" name=\"\">\r\n");
      out.write("                  <!-- todo text -->\r\n");
      out.write("                  <span class=\"text\">Design a nice theme</span>\r\n");
      out.write("                  <!-- Emphasis label -->\r\n");
      out.write("                  <small class=\"label label-danger\"><i class=\"fa fa-clock-o\"></i> 2 mins</small>\r\n");
      out.write("                  <!-- General tools such as edit or delete-->\r\n");
      out.write("                  <div class=\"tools\">\r\n");
      out.write("                    <i class=\"fa fa-edit\"></i>\r\n");
      out.write("                    <i class=\"fa fa-trash-o\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                      <span class=\"handle\">\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                  <input type=\"checkbox\" value=\"\" name=\"\">\r\n");
      out.write("                  <span class=\"text\">Make the theme responsive</span>\r\n");
      out.write("                  <small class=\"label label-info\"><i class=\"fa fa-clock-o\"></i> 4 hours</small>\r\n");
      out.write("                  <div class=\"tools\">\r\n");
      out.write("                    <i class=\"fa fa-edit\"></i>\r\n");
      out.write("                    <i class=\"fa fa-trash-o\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                      <span class=\"handle\">\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                  <input type=\"checkbox\" value=\"\" name=\"\">\r\n");
      out.write("                  <span class=\"text\">Let theme shine like a star</span>\r\n");
      out.write("                  <small class=\"label label-warning\"><i class=\"fa fa-clock-o\"></i> 1 day</small>\r\n");
      out.write("                  <div class=\"tools\">\r\n");
      out.write("                    <i class=\"fa fa-edit\"></i>\r\n");
      out.write("                    <i class=\"fa fa-trash-o\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                      <span class=\"handle\">\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                  <input type=\"checkbox\" value=\"\" name=\"\">\r\n");
      out.write("                  <span class=\"text\">Let theme shine like a star</span>\r\n");
      out.write("                  <small class=\"label label-success\"><i class=\"fa fa-clock-o\"></i> 3 days</small>\r\n");
      out.write("                  <div class=\"tools\">\r\n");
      out.write("                    <i class=\"fa fa-edit\"></i>\r\n");
      out.write("                    <i class=\"fa fa-trash-o\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                      <span class=\"handle\">\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                  <input type=\"checkbox\" value=\"\" name=\"\">\r\n");
      out.write("                  <span class=\"text\">Check your messages and notifications</span>\r\n");
      out.write("                  <small class=\"label label-primary\"><i class=\"fa fa-clock-o\"></i> 1 week</small>\r\n");
      out.write("                  <div class=\"tools\">\r\n");
      out.write("                    <i class=\"fa fa-edit\"></i>\r\n");
      out.write("                    <i class=\"fa fa-trash-o\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                      <span class=\"handle\">\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                        <i class=\"fa fa-ellipsis-v\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                  <input type=\"checkbox\" value=\"\" name=\"\">\r\n");
      out.write("                  <span class=\"text\">Let theme shine like a star</span>\r\n");
      out.write("                  <small class=\"label label-default\"><i class=\"fa fa-clock-o\"></i> 1 month</small>\r\n");
      out.write("                  <div class=\"tools\">\r\n");
      out.write("                    <i class=\"fa fa-edit\"></i>\r\n");
      out.write("                    <i class=\"fa fa-trash-o\"></i>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-body <i class=\"fa fa-plus\"></i>-->\r\n");
      out.write("            <div class=\"box-footer clearfix no-border\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-default pull-right\"> Finish</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.box -->\r\n");
      out.write("\t\t</section>\r\n");
      out.write("        <!-- /.Left col -->\r\n");
      out.write("        <!-- right col (We are only adding the ID to make the widgets sortable)-->\r\n");
      out.write("        <section class=\"col-lg-5 connectedSortable\">\r\n");
      out.write("        \t<!-- quick email widget -->\r\n");
      out.write("\t\t\t <div class=\"box box-info\">\r\n");
      out.write("            <div class=\"box-header\">\r\n");
      out.write("              <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("\r\n");
      out.write("              <h3 class=\"box-title\">Quick Email</h3>\r\n");
      out.write("              <!-- /. tools -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box-body\">\r\n");
      out.write("              <form action=\"#\" method=\"post\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"email\" class=\"form-control\" name=\"emailto\" placeholder=\"Email to:\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"subject\" placeholder=\"Subject\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                  <textarea class=\"textarea\" placeholder=\"Message\" style=\"width: 100%; height: 125px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box-footer clearfix\">\r\n");
      out.write("              <button type=\"button\" class=\"pull-right btn btn-default\" id=\"sendEmail\">Send\r\n");
      out.write("                <i class=\"fa fa-arrow-circle-right\"></i></button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div> </section>\r\n");
      out.write("        <!-- right col -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.row (main row) -->\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- /.content -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.content-wrapper -->\r\n");
      out.write("  <footer class=\"main-footer\">\r\n");
      out.write("    <div class=\"pull-right hidden-xs\">\r\n");
      out.write("      <b>Version</b> 2.3.1\r\n");
      out.write("    </div>\r\n");
      out.write("    <strong>Copyright &copy; 2014-2015 <a href=\"http://www.mindfiresolutions.com/\">Mindfire Solutions</a>.</strong> All rights\r\n");
      out.write("    reserved.\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Create the tabs -->\r\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\r\n");
      out.write("    \r\n");
      out.write("      <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("\t<div class=\"tab-pane\" id=\"control-sidebar-home-tab\">\r\n");
      out.write("      </div>\r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- /.tab-pane -->\r\n");
      out.write("    </div>\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("  <!-- Add the sidebar's background. This div must be placed\r\n");
      out.write("       immediately after the control sidebar -->\r\n");
      out.write("  <div class=\"control-sidebar-bg\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- .Angular files -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_14(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- jQuery 2.1.4 -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_15(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- jQuery UI 1.11.4 -->\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\r\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("<script>\r\n");
      out.write("  $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap 3.3.5 -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_16(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- Morris.js charts -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_17(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- Sparkline -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_18(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- jvectormap -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_19(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_20(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- jQuery Knob Chart -->\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_21(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- daterangepicker -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js\"></script>\r\n");
      out.write("<script src=\"");
      if (_jspx_meth_c_url_22(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<!-- datepicker -->\r\n");
      out.write("<script src=\"assets/plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("<script src=\"assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("<!-- Slimscroll -->\r\n");
      out.write("<script src=\"assets/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<!-- FastClick -->\r\n");
      out.write("<script src=\"assets/plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"assets/dist/js/app.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("<script src=\"assets/dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"assets/dist/js/demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("assets/dist/img/favicon.ico");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("assets/bootstrap/css/bootstrap.min.css");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("assets/dist/css/AdminLTE.min.css");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("assets/dist/css/skins/_all-skins.min.css");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("assets/plugins/iCheck/flat/blue.css");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("assets/plugins/morris/morris.css");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("assets/plugins/jvectormap/jquery-jvectormap-1.2.2.css");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("assets/plugins/datepicker/datepicker3.css");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }

  private boolean _jspx_meth_c_url_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_8.setPageContext(_jspx_page_context);
    _jspx_th_c_url_8.setParent(null);
    _jspx_th_c_url_8.setValue("assets/plugins/daterangepicker/daterangepicker-bs3.css");
    int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
    if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
    return false;
  }

  private boolean _jspx_meth_c_url_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_9.setPageContext(_jspx_page_context);
    _jspx_th_c_url_9.setParent(null);
    _jspx_th_c_url_9.setValue("assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css");
    int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
    if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
    return false;
  }

  private boolean _jspx_meth_c_url_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_10.setPageContext(_jspx_page_context);
    _jspx_th_c_url_10.setParent(null);
    _jspx_th_c_url_10.setValue("assets/topSideFrame.jsp");
    int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
    if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
    return false;
  }

  private boolean _jspx_meth_sec_authorize_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_sec_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authorize_0.setParent(null);
    _jspx_th_sec_authorize_0.setAccess("hasRole('ANONYMOUS')");
    int _jspx_eval_sec_authorize_0 = _jspx_th_sec_authorize_0.doStartTag();
    if (_jspx_eval_sec_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sec_authorize_0, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
    }
    if (_jspx_th_sec_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
      return true;
    }
    _jspx_tagPool_sec_authorize_access.reuse(_jspx_th_sec_authorize_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_authorize_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_authorize_0);
    _jspx_th_c_redirect_0.setUrl("/loginPage");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_c_url_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_11.setPageContext(_jspx_page_context);
    _jspx_th_c_url_11.setParent(null);
    _jspx_th_c_url_11.setValue("assets/dist/img/ramakrishna.jpg");
    int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
    if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
    return false;
  }

  private boolean _jspx_meth_sec_authentication_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_authentication_0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _jspx_tagPool_sec_authentication_property_nobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_sec_authentication_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authentication_0.setParent(null);
    _jspx_th_sec_authentication_0.setProperty("principal.employeeUserName");
    int _jspx_eval_sec_authentication_0 = _jspx_th_sec_authentication_0.doStartTag();
    if (_jspx_th_sec_authentication_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_0);
      return true;
    }
    _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_0);
    return false;
  }

  private boolean _jspx_meth_c_url_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_12.setPageContext(_jspx_page_context);
    _jspx_th_c_url_12.setParent(null);
    _jspx_th_c_url_12.setValue("assets/dist/img/ramakrishna.jpg");
    int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
    if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
    return false;
  }

  private boolean _jspx_meth_sec_authentication_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_authentication_1 = (org.springframework.security.taglibs.authz.AuthenticationTag) _jspx_tagPool_sec_authentication_property_nobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_sec_authentication_1.setPageContext(_jspx_page_context);
    _jspx_th_sec_authentication_1.setParent(null);
    _jspx_th_sec_authentication_1.setProperty("principal.employeeUserName");
    int _jspx_eval_sec_authentication_1 = _jspx_th_sec_authentication_1.doStartTag();
    if (_jspx_th_sec_authentication_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_1);
      return true;
    }
    _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_1);
    return false;
  }

  private boolean _jspx_meth_c_url_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_13.setPageContext(_jspx_page_context);
    _jspx_th_c_url_13.setParent(null);
    _jspx_th_c_url_13.setValue("/logout");
    _jspx_th_c_url_13.setVar("Signout");
    int _jspx_eval_c_url_13 = _jspx_th_c_url_13.doStartTag();
    if (_jspx_th_c_url_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_13);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_13);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.userPrincipal.name != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t    <a class=\"btn btn-default btn-flat\" href=\"javascript:document.getElementById('logout').submit()\">Logout</a>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_sec_authentication_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_authentication_2 = (org.springframework.security.taglibs.authz.AuthenticationTag) _jspx_tagPool_sec_authentication_property_nobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_sec_authentication_2.setPageContext(_jspx_page_context);
    _jspx_th_sec_authentication_2.setParent(null);
    _jspx_th_sec_authentication_2.setProperty("principal.accountId");
    int _jspx_eval_sec_authentication_2 = _jspx_th_sec_authentication_2.doStartTag();
    if (_jspx_th_sec_authentication_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_2);
      return true;
    }
    _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_2);
    return false;
  }

  private boolean _jspx_meth_c_url_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_14.setPageContext(_jspx_page_context);
    _jspx_th_c_url_14.setParent(null);
    _jspx_th_c_url_14.setValue("assets/angular/masterController.js");
    int _jspx_eval_c_url_14 = _jspx_th_c_url_14.doStartTag();
    if (_jspx_th_c_url_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_14);
    return false;
  }

  private boolean _jspx_meth_c_url_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_15.setPageContext(_jspx_page_context);
    _jspx_th_c_url_15.setParent(null);
    _jspx_th_c_url_15.setValue("assets/plugins/jQuery/jQuery-2.1.4.min.js");
    int _jspx_eval_c_url_15 = _jspx_th_c_url_15.doStartTag();
    if (_jspx_th_c_url_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_15);
    return false;
  }

  private boolean _jspx_meth_c_url_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_16.setPageContext(_jspx_page_context);
    _jspx_th_c_url_16.setParent(null);
    _jspx_th_c_url_16.setValue("assets/bootstrap/js/bootstrap.min.js");
    int _jspx_eval_c_url_16 = _jspx_th_c_url_16.doStartTag();
    if (_jspx_th_c_url_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_16);
    return false;
  }

  private boolean _jspx_meth_c_url_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_17.setPageContext(_jspx_page_context);
    _jspx_th_c_url_17.setParent(null);
    _jspx_th_c_url_17.setValue("assets/plugins/morris/morris.min.js");
    int _jspx_eval_c_url_17 = _jspx_th_c_url_17.doStartTag();
    if (_jspx_th_c_url_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_17);
    return false;
  }

  private boolean _jspx_meth_c_url_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_18.setPageContext(_jspx_page_context);
    _jspx_th_c_url_18.setParent(null);
    _jspx_th_c_url_18.setValue("assets/plugins/sparkline/jquery.sparkline.min.js");
    int _jspx_eval_c_url_18 = _jspx_th_c_url_18.doStartTag();
    if (_jspx_th_c_url_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_18);
    return false;
  }

  private boolean _jspx_meth_c_url_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_19 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_19.setPageContext(_jspx_page_context);
    _jspx_th_c_url_19.setParent(null);
    _jspx_th_c_url_19.setValue("assets/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js");
    int _jspx_eval_c_url_19 = _jspx_th_c_url_19.doStartTag();
    if (_jspx_th_c_url_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_19);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_19);
    return false;
  }

  private boolean _jspx_meth_c_url_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_20 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_20.setPageContext(_jspx_page_context);
    _jspx_th_c_url_20.setParent(null);
    _jspx_th_c_url_20.setValue("assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js");
    int _jspx_eval_c_url_20 = _jspx_th_c_url_20.doStartTag();
    if (_jspx_th_c_url_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_20);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_20);
    return false;
  }

  private boolean _jspx_meth_c_url_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_21 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_21.setPageContext(_jspx_page_context);
    _jspx_th_c_url_21.setParent(null);
    _jspx_th_c_url_21.setValue("assets/plugins/knob/jquery.knob.js");
    int _jspx_eval_c_url_21 = _jspx_th_c_url_21.doStartTag();
    if (_jspx_th_c_url_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_21);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_21);
    return false;
  }

  private boolean _jspx_meth_c_url_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_22 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_22.setPageContext(_jspx_page_context);
    _jspx_th_c_url_22.setParent(null);
    _jspx_th_c_url_22.setValue("assets/plugins/daterangepicker/daterangepicker.js");
    int _jspx_eval_c_url_22 = _jspx_th_c_url_22.doStartTag();
    if (_jspx_th_c_url_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_22);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_22);
    return false;
  }
}
