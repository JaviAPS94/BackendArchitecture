# Camera Reviews System
---
## Problem to solve

The company "RandomCameraReviews" needs a system that allows professional photographers to upload "reviews" of cameras, so that anyone from anywhere in the world can search for the reviews and buy them through their portal.
The company has a team of developers specialized in frontEnd that will create a portal for editors to upload the "reviews" and users can see them, and they have requested that you, as a speciesist in Backend, provide them with a system, including API that allows them to perform the next:

* Upload camera reviews
* Obtain the content of the reviews to show it in portal views in its web and mobile versions.
* User management for editors (does not include visitors who read reviews)

It is also known that the company "RandomCameraReviews" plans to distribute mainly in South America where its largest market is, but they also have sales in North America, Europe, and very few in Asia.

### Scope


This design document presents a proposed solution to implement a backend system that meets the [requirements imposed by the company "RandomCameraReviews"](./Definition.md).

#### Use cases

* As an editor I would like to upload a review of a camera.
* As editor I would like to upload a review of a lens for cameras.
* As an unregistered user I would like to read a review of a camera.

#### Out of Scope (Unsupported use cases)

* As an unregistered user I would like to be able to upload a review of a camera.
* As a user outside the system I would like to register editor users.

---
## Architecture

### Diagrams
put sequence diagrams, uml, etc

### Data model
Put design of entities, Jsons, tables, entity relationship diagrams, etc.

---
## Limitations

* Calls to the API that allows you to upload a review, does not exceed the 500ms latency limits.
* API calls that allow to obtain reviews for reading must have a latency of less than 100ms.
---
## Cost
Description / Cost Analysis
Example:
"Considering N daily users, M calls to X service / database / etc"
* 1000 daily calls to serverless functions. $ XX.XX
* 1000 read / write units daily to X Database on-demand. $ XX.XX
  Total: $ xx.xx (per month / day / year)
