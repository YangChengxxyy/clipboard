<template>
  <v-app>
    <v-app-bar app dark color="cyan">
      <v-app-bar-title>剪贴板</v-app-bar-title>
    </v-app-bar>

    <!-- 根据应用组件来调整你的内容 -->
    <v-main>
      <!-- 给应用提供合适的间距 -->
      <v-container fluid>
        <v-row>
          <v-col cols="12" md="8" offset-md="2">
            <v-tabs v-model="tab" align-with-title>
              <v-tabs-slider></v-tabs-slider>
              <v-tab> 文本 </v-tab>
              <v-tab> 文件 </v-tab>
            </v-tabs>
            <v-tabs-items v-model="tab">
              <v-card>
              <template v-if="tab == 0">
                <TextBoard></TextBoard>
              </template>
              <template v-else-if="tab == 1">
                <File></File>
              </template>
              </v-card>
            </v-tabs-items>
          </v-col>
        </v-row>
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
import File from "./components/File.vue";
import TextBoard from "./components/TextBoard.vue";
export default {
  components: { TextBoard, File },
  name: "App",

  data: () => ({
    tab: 0,
  }),
};
</script>
