def getBuildComponentsBySublist(String sublist) {

    return sh(script: "cat ${buildComponents} | jq -r .'applications.sublists[] | select(.name == \"${sublist}\") | .repos[] | select(.enabled == true) | .repo_name'", returnStdout: true)
}

def catJson(){
    return sh(script: "cat ${buildComponents}" ,returnStdout: true)
}

def totest(){
    echo "Im here baby"
}