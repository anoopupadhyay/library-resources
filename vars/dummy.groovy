#!/usr/bin/env groovy

/**
 * Dummy function
 */
void dummy() {
    stage('Dummy') {
        node {
            sh 'echo Dummy stage'
        }
    }
}
