def totest(){
    echo "Im here baby"
}

def getconfigPath(String apiComp){
    return sh(script: "cat ${apiComponents}" | jq -r .api."${apiComp}".configPath ,returnStdout: true)
}

return this;