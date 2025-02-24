z<%@page contentType="text/html" pageEncoding="UTF-8" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!-- format kiểu dữ liệu double nếu số nó dài quá  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      rel="stylesheet"
      id="bootstrap-css"
    />
    <link rel="stylesheet" href="/css/login.css" />
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  </head>
  <body>
    <div class="login-reg-panel">
      <div class="login-info-box">
        <h2>Bạn đã có tài khoản ?s</h2>
        <p>Đăng nhập ngay nhé</p>
        <label id="label-register" for="log-reg-show">Đăng nhập</label>
        <input
          type="radio"
          name="active-log-panel"
          id="log-reg-show"
          checked="checked"
        />
      </div>

      <div class="register-info-box">
        <h2>Bạn chưa có tài khoản ư?</h2>
        <p>Lorem ipsum dolor sit amet</p>
        <label id="label-login" for="log-login-show">Register</label>
        <input type="radio" name="active-log-panel" id="log-login-show" />
      </div>

      <div class="white-panel">
        <!-- login -->
        <div class="login-show">
          <h2>LOGIN</h2>
          <form method="post" action="/authenticateTheUser">
            <input type="text" name="username" placeholder="Username" />
            <input type="password" name="password" placeholder="Password" />
            <input
              type="hidden"
              name="${_csrf.parameterName}"
              value="${_csrf.token}"
            />
            <button type="submit" class="btn btn-primary btn-block mb-1">
              Đăng Nhập <i class="fas fa-sign-in-alt ms-2"></i>
            </button>

            <a href="">Forgot password?</a>
          </form>
        </div>

        <!-- register -->
        <!-- register -->
        <div class="register-show">
          <h2 class="text-center mb-1">REGISTER</h2>
          <form action="/register" method="POST">
            <div class="row">
              <!-- Email -->
              <div class="col-6 mb-1">
                <label for="email"
                  ><i class="fas fa-envelope me-2"></i>Email</label
                >
                <input
                  type="email"
                  class="form-control"
                  id="email"
                  name="email"
                  placeholder="Email"
                  required
                />
              </div>
              <!-- Phone Number -->
              <div class="col-6 mb-1">
                <label for="phoneNumber"
                  ><i class="fas fa-phone me-2"></i>Số điện thoại</label
                >
                <input
                  type="tel"
                  class="form-control"
                  id="phoneNumber"
                  name="phoneNumber"
                  placeholder="Số điện thoại"
                  required
                />
              </div>
            </div>
            <!-- Full Name -->
            <div class="">
              <label for="fullName"><i class="fas fa-user"></i>Full Name</label>
              <input
                type="text"
                class="form-control"
                id="fullName"
                name="fullName"
                placeholder="Full Name"
                required
              />
            </div>

            <!-- Username -->
            <div class="mb-1">
              <label for="username"
                ><i class="fas fa-user-tag me-2"></i>Username</label
              >
              <input
                type="text"
                class="form-control"
                id="username"
                name="username"
                placeholder="Username"
                required
              />
            </div>

            <!-- Password and Confirm Password in row -->
            <div class="row mb-1">
              <div class="col-md-6 mb-1 mb-md-0">
                <div class="">
                  <label for="password"
                    ><i class="fas fa-lock me-2"></i>Password</label
                  >
                  <input
                    type="password"
                    id="password"
                    class="form-control"
                    placeholder="Password"
                    name="password"
                    required
                  />
                </div>
              </div>
              <div class="col-md-6">
                <label for="matchingPassword"
                  ><i class="fas fa-lock me-2"></i>Confirm Password</label
                >
                <div class="">
                  <input
                    type="password"
                    class="form-control"
                    id="matchingPassword"
                    placeholder="Confirm Password"
                    name="matchingPassword"
                    required
                  />
                </div>
              </div>
            </div>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary w-100 py-2 mb-3 mt-2">
              <i class="fas fa-user-plus me-2"></i>Register
            </button>

            <!-- CSRF token -->
            <input
              type="hidden"
              name="${_csrf.parameterName}"
              value="${_csrf.token}"
            />
          </form>
        </div>
      </div>
    </div>
    <script src="/js/login.js"></script>
  </body>
</html>
