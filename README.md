# simple-api

이 프로젝트 springboot기반  simple-api project입니다.

주로 단순한 서비스 연동, 클러스터에서의 서비스 확인,CICD테스트 등의 용도로 사용됩니다.

빌드 및 실행을 위해 jdk(jdk11이상)는 미리 설치되어 있어야 하며 
maven wrapper를 통해 다음과 같이 실행하시기 바랍니다.

```bash
#build
./mvnw clean install -DskipTests
#run
./mvnw spring-boot:run
```

## 클러스터에 빌드하고 배포하기

skaffold를 이용하여 -p(profile), -t(version-git tag) 옵션을 적절히 주고 실행하면 해당 클러스터에 디버깅 모드로 배포됩니다.

```bash
# debug mode
skaffold dev -p dev -t 0.0.1 
# build
skaffold build -p dev -t 0.0.1 
# run
skaffold run -p dev -t 0.0.1 
```

클러스터에 요청을 보내어 로그가 정상적으로 들어오는지 확인한다.