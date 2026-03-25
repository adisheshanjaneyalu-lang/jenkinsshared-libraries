def call(String imageName, String tag, String dockerhubUser) {
    sh "docker build -t ${dockerhubUser}/${imageName}:${tag} ."
}
