# Changelog
All notable changes to this project will be documented in this file.

## 0.x.x - date

### Added

- Added filter to ignore all files starting with dot

### Deprecated

- Removed deprecated methods that haven't been valid since iOS 9

### Removed

## 0.1.0 - 2018-10-04

### Added

- Adds `sharingProhibited` field to PKPass

### Deprecated

- most methods in `PKSendPushNotificationUtil` deprecated

### Removed

- Removed unsupported APNS dependency and replaced it with [pushy](https://github.com/relayrides/pushy)

### Fixed

- none


## 0.0.9 - 2017-01-12

### Added

- Implement "barcode" & "barcodes" synchronization
- Support relative path for template resources
- Support non-unix file separators in manifest files
- Personalizable passes and the personalization web service endpoints (for Reward programs)

### Deprecated

### Removed

### Fixed

- Added validation for "auxiliaryFields"
- Fix warnings in pom.xml



## 0.0.8 - 2015-??

### Added

- Dynamic pass templates
- Separate class to load certificates
- More specialized utility classes for signing 

### Deprecated

- PKSigningUtil

### Removed

- Support for Java 1.6/1.7

### Fixed



## 0.0.7 - 2015-??

### Added

### Deprecated

### Removed

### Fixed



## 0.0.6 - 2015-??

### Added

### Deprecated

### Removed

### Fixed



## 0.0.5 - 2015-06-02

### Added

### Deprecated

### Removed

### Fixed

- Exception when writing manifest file (#38)

## 0.0.5 - 2015-06-01

- Dependency updates (Jackson, ...)

### Fixed
- Switched to the current version of jpasskit (and Jackson 2) in jpasskit.server
- 

## 0.0.4 - 2014-06-11
### Added
- iBeacon support (iOS7 and later)
- Data detector types (iOS7 and later)
- Date fields now can add a flag to ignore the timezone (iOS7 and later)
- Relevance & expiration fields for passes (iOS7 and later)
- More information when using APNS logging
- Switched to Jackson 2
- Attido PassWallet support for android devices to allow linking of android apps to the pass

### Deprecated
- Shine effect on passes (deprecated in iOS7)

### Removed
- Jackson 1

### Fixed
- Nothing

## 0.0.3 - 2013-10-29
### Added
- Nothing

### Deprecated
- Nothing

### Removed
- Nothing

### Fixed
- Made passes serializable
- Windows file separators are not supported by Passbook, replaced them with UNIX separators

## 0.0.2 - 2013-04-16
### Added
- Allowed BigDecimals as valid field value
- Methods to set colors as Color objects (instead of just Strings) to fields and passes
- Field validation and validation error messages
- Enums for a lot of options (text alignment, date/number style)
- Container class for signing information (used by PKSigningUtil)
- Ability to load PKCS12 and DER certificates from file/inputstream (and create PKSigningInformation out of it)
- SSL support for server
- Ability to send multiple push notifications at once and query inactive devices

### Deprecated
- Nothing

### Removed
- Methods that use strings instead of enums
- Java 1.5 support

### Fixed
- Issue with untrimmed values in RGB String (e.g. `rgb(r, g, b,)`)
- Zip file wouldn't be generated correctly on windows because of the path separator being different
- Clutter being added to pass.json (convenience methods being translated to fields)
- Bug where jackson would serialize dates as timestamps instead of a date string

## 0.0.1 - 2012-09-19
### Added
- Initial version (see Apple's spec and readme) 

### Deprecated
- Nothing

### Removed
- Nothing

### Fixed
- Nothing
