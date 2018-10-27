
- maven-eclipse
  ```
  mvn dependency:copy-dependencies -DoutputDirectory=lib
  ```

- Jacoco
   ```
   mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent test
   mvn org.jacoco:jacoco-maven-plugin:report
   ```
