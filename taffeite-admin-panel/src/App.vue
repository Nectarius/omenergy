<template>
  <div id="app">
    <nav class="navbar navbar-expand navbar-dark bg-dark">
      <router-link to="/" class="navbar-brand">Admin Panel</router-link>
      <div class="navbar-nav mr-auto">
        <li class="nav-item">
          <router-link to="/training-descriptions" class="nav-link">Тренировочный курсы</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/add" class="nav-link">Добавить курс</router-link>
        </li>
        <li class="nav-item">
                  <router-link to="/info-data" class="nav-link">О себе</router-link>
        </li>
      </div>
    </nav>

    <div class="container mt-3">
      <router-view />
    </div>
  </div>
</template>

<script>
export default {
  name: "app"
};
</script>
