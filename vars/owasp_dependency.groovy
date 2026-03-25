def call() {
    dependencyCheck additionalArguments: '--scan ./ --format XML', odcInstallation: 'DC'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
