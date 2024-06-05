<template>
  <div>
    <nav class="bg-black">
      <div class="nav-left">
        <router-link to="/" class="logo"> GymFitPro </router-link>
      </div>
      <div class="nav-right flex flex-row gap-2">
        <router-link to="/">Dashboard</router-link> |
        <router-link to="/member-type">Membership Type</router-link> |
        <router-link to="/attendance">Attendance</router-link> |
        <router-link to="/exercise">Exercise</router-link> |
        <router-link to="/members">Members</router-link> |
        <router-link to="/account" class="flex flex-row">
          <svg xmlns="http://www.w3.org/2000/svg" fill="none" stroke-width="1.5"
            stroke="currentColor" class="size-6">
            <path stroke-linecap="round" stroke-linejoin="round"
              d="M17.982 18.725A7.488 7.488 0 0 0 12 15.75a7.488 7.488 0 0 0-5.982 2.975m11.963 0a9 9 0 1 0-11.963 0m11.963 0A8.966 8.966 0 0 1 12 21a8.966 8.966 0 0 1-5.982-2.275M15 9.75a3 3 0 1 1-6 0 3 3 0 0 1 6 0Z" />
          </svg>
        </router-link>
      </div>
    </nav>
    <router-view />
  </div>
</template>

<script>

export default {

}

</script>

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
  padding-inline: 30px;
  padding-block: 30px;
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

.logo {
  color: white;
}

nav .logo.router-link-exact-active {
  color: white;
}
</style>
