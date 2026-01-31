Started by user Vishal Ramesh Wagh
Running as SYSTEM
Building on the built-in node in workspace /var/lib/jenkins/workspace/java-jenkins-ci-pipeline
The recommended git tool is: NONE
No credentials specified
 > git rev-parse --resolve-git-dir /var/lib/jenkins/workspace/java-jenkins-ci-pipeline/.git # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/vishalrwagh1999/java-jenkins-ci-pipeline # timeout=10
Fetching upstream changes from https://github.com/vishalrwagh1999/java-jenkins-ci-pipeline
 > git --version # timeout=10
 > git --version # 'git version 2.43.0'
 > git fetch --tags --force --progress -- https://github.com/vishalrwagh1999/java-jenkins-ci-pipeline +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/main^{commit} # timeout=10
Checking out Revision a511a57ca825bfd04c51bccdfc3b1b7dc393ff2d (refs/remotes/origin/main)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f a511a57ca825bfd04c51bccdfc3b1b7dc393ff2d # timeout=10
Commit message: "Add project title to README"
 > git rev-list --no-walk a511a57ca825bfd04c51bccdfc3b1b7dc393ff2d # timeout=10
[java-jenkins-ci-pipeline] $ /bin/sh -xe /tmp/jenkins3859385411393810802.sh
+ javac RepublicDay2026.java
+ java RepublicDay2026
====================================
  REPUBLIC DAY 2026 - DETAILS
====================================

Date: Monday, 26 January 2026
Day: MONDAY
Date (DD/MM/YYYY): 26/01/2026

--- About Republic Day ---
Republic Day is celebrated on 26th January every year in India.
It commemorates the adoption of the Indian Constitution.

--- Celebration Details ---
• National Holiday: Yes
• Main Celebration: New Delhi (India Gate)
• Flag Hoisting: Throughout the country
• National Anthem: Sung across the nation
• Parade: Grand parade with military and cultural displays

--- Republic Day 2026 Facts ---
• Year of celebration: 77th Republic Day
• Constitution age: 76 years old
• Day of week: MONDAY
• Status: National Holiday

--- Important Points ---
• Preamble of Constitution starts with 'We the People'
• India has the world's longest written constitution
• Constitution has 448 articles and 12 schedules
• Dr. B.R. Ambedkar led the Drafting Committee

====================================

--- Days Information ---
Days until Republic Day 2026 (from today's perspective):
Days passed since Republic Day 2026: 5 days

====================================

Finished: SUCCESS
