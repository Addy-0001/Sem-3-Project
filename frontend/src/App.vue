<template>
  <div>
    <nav class="bg-black">
      <div class="nav-left">
        <router-link to="/" class="logo"> GymFitPro </router-link>
      </div>
      <div class="nav-right">
        <router-link to="/">Dashboard</router-link> |
        <router-link to="/member-type">Membership Type</router-link> |
        <router-link to="/attendance">Attendance</router-link> |
        <router-link to="/exercise">Exercise</router-link> |
        <router-link to="/members">Members</router-link> |
      </div>
    </nav>
    <router-view />
  </div>
</template>

<style>
body {
  margin: 0;
  padding: 0;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
  background-color: black;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
}

nav a {
  font-weight: bold;
  color: #ffffff;
}

nav a.router-link-exact-active {
  color: #42b983;
}

.logo{
  color: white;
}
</style>
