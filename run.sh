#!/bin/bash

echo "✅ Running tests..."
mvn clean test

if [ $? -eq 0 ]; then
  echo "✅ Test execution completed. Uploading results to Bugasura..."
else
  echo "⚠️ Tests finished with some errors. Still attempting upload..."
fi

bugasura UPLOAD_RESULTS target/surefire-reports/result.xml \
  --api_key d9925801b61bb8ce242ab7998223accbe3bbae19 \
  --team_id 83422 \
  --project_id 112220 \
  --testrun_id 126772 \
  --server=facilio


