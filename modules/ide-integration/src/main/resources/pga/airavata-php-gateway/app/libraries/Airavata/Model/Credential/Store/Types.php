<?php
namespace Airavata\Model\Credential\Store;

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


/**
 * Data Types supported in Airavata. The primitive data types
 * 
 */
final class SummaryType {
  const SSH = 0;
  const PASSWD = 1;
  const CERT = 2;
  static public $__names = array(
    0 => 'SSH',
    1 => 'PASSWD',
    2 => 'CERT',
  );
}

class SSHCredential {
  static $_TSPEC;

  /**
   * @var string
   */
  public $gatewayId = null;
  /**
   * @var string
   */
  public $username = null;
  /**
   * @var string
   */
  public $passphrase = null;
  /**
   * @var string
   */
  public $publicKey = null;
  /**
   * @var string
   */
  public $privateKey = null;
  /**
   * @var int
   */
  public $persistedTime = null;
  /**
   * @var string
   */
  public $token = null;
  /**
   * @var string
   */
  public $description = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'gatewayId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'username',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'passphrase',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'publicKey',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'privateKey',
          'type' => TType::STRING,
          ),
        6 => array(
          'var' => 'persistedTime',
          'type' => TType::I64,
          ),
        7 => array(
          'var' => 'token',
          'type' => TType::STRING,
          ),
        8 => array(
          'var' => 'description',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['gatewayId'])) {
        $this->gatewayId = $vals['gatewayId'];
      }
      if (isset($vals['username'])) {
        $this->username = $vals['username'];
      }
      if (isset($vals['passphrase'])) {
        $this->passphrase = $vals['passphrase'];
      }
      if (isset($vals['publicKey'])) {
        $this->publicKey = $vals['publicKey'];
      }
      if (isset($vals['privateKey'])) {
        $this->privateKey = $vals['privateKey'];
      }
      if (isset($vals['persistedTime'])) {
        $this->persistedTime = $vals['persistedTime'];
      }
      if (isset($vals['token'])) {
        $this->token = $vals['token'];
      }
      if (isset($vals['description'])) {
        $this->description = $vals['description'];
      }
    }
  }

  public function getName() {
    return 'SSHCredential';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->username);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->passphrase);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->publicKey);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->privateKey);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->persistedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->token);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->description);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SSHCredential');
    if ($this->gatewayId !== null) {
      $xfer += $output->writeFieldBegin('gatewayId', TType::STRING, 1);
      $xfer += $output->writeString($this->gatewayId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->username !== null) {
      $xfer += $output->writeFieldBegin('username', TType::STRING, 2);
      $xfer += $output->writeString($this->username);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->passphrase !== null) {
      $xfer += $output->writeFieldBegin('passphrase', TType::STRING, 3);
      $xfer += $output->writeString($this->passphrase);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->publicKey !== null) {
      $xfer += $output->writeFieldBegin('publicKey', TType::STRING, 4);
      $xfer += $output->writeString($this->publicKey);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->privateKey !== null) {
      $xfer += $output->writeFieldBegin('privateKey', TType::STRING, 5);
      $xfer += $output->writeString($this->privateKey);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->persistedTime !== null) {
      $xfer += $output->writeFieldBegin('persistedTime', TType::I64, 6);
      $xfer += $output->writeI64($this->persistedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->token !== null) {
      $xfer += $output->writeFieldBegin('token', TType::STRING, 7);
      $xfer += $output->writeString($this->token);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->description !== null) {
      $xfer += $output->writeFieldBegin('description', TType::STRING, 8);
      $xfer += $output->writeString($this->description);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class CredentialSummary {
  static $_TSPEC;

  /**
   * @var int
   */
  public $type = null;
  /**
   * @var string
   */
  public $gatewayId = null;
  /**
   * The username corresponds to the Credential's `portalUserName` which is the username of the user that
   * created the credential.
   * 
   * @var string
   */
  public $username = null;
  /**
   * @var string
   */
  public $publicKey = null;
  /**
   * @var int
   */
  public $persistedTime = null;
  /**
   * @var string
   */
  public $token = null;
  /**
   * @var string
   */
  public $description = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'type',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'gatewayId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'username',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'publicKey',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'persistedTime',
          'type' => TType::I64,
          ),
        6 => array(
          'var' => 'token',
          'type' => TType::STRING,
          ),
        7 => array(
          'var' => 'description',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['type'])) {
        $this->type = $vals['type'];
      }
      if (isset($vals['gatewayId'])) {
        $this->gatewayId = $vals['gatewayId'];
      }
      if (isset($vals['username'])) {
        $this->username = $vals['username'];
      }
      if (isset($vals['publicKey'])) {
        $this->publicKey = $vals['publicKey'];
      }
      if (isset($vals['persistedTime'])) {
        $this->persistedTime = $vals['persistedTime'];
      }
      if (isset($vals['token'])) {
        $this->token = $vals['token'];
      }
      if (isset($vals['description'])) {
        $this->description = $vals['description'];
      }
    }
  }

  public function getName() {
    return 'CredentialSummary';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->type);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->username);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->publicKey);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->persistedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->token);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->description);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('CredentialSummary');
    if ($this->type !== null) {
      $xfer += $output->writeFieldBegin('type', TType::I32, 1);
      $xfer += $output->writeI32($this->type);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->gatewayId !== null) {
      $xfer += $output->writeFieldBegin('gatewayId', TType::STRING, 2);
      $xfer += $output->writeString($this->gatewayId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->username !== null) {
      $xfer += $output->writeFieldBegin('username', TType::STRING, 3);
      $xfer += $output->writeString($this->username);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->publicKey !== null) {
      $xfer += $output->writeFieldBegin('publicKey', TType::STRING, 4);
      $xfer += $output->writeString($this->publicKey);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->persistedTime !== null) {
      $xfer += $output->writeFieldBegin('persistedTime', TType::I64, 5);
      $xfer += $output->writeI64($this->persistedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->token !== null) {
      $xfer += $output->writeFieldBegin('token', TType::STRING, 6);
      $xfer += $output->writeString($this->token);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->description !== null) {
      $xfer += $output->writeFieldBegin('description', TType::STRING, 7);
      $xfer += $output->writeString($this->description);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class CommunityUser {
  static $_TSPEC;

  /**
   * @var string
   */
  public $gatewayName = null;
  /**
   * @var string
   */
  public $username = null;
  /**
   * @var string
   */
  public $userEmail = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'gatewayName',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'username',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'userEmail',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['gatewayName'])) {
        $this->gatewayName = $vals['gatewayName'];
      }
      if (isset($vals['username'])) {
        $this->username = $vals['username'];
      }
      if (isset($vals['userEmail'])) {
        $this->userEmail = $vals['userEmail'];
      }
    }
  }

  public function getName() {
    return 'CommunityUser';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->username);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->userEmail);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('CommunityUser');
    if ($this->gatewayName !== null) {
      $xfer += $output->writeFieldBegin('gatewayName', TType::STRING, 1);
      $xfer += $output->writeString($this->gatewayName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->username !== null) {
      $xfer += $output->writeFieldBegin('username', TType::STRING, 2);
      $xfer += $output->writeString($this->username);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->userEmail !== null) {
      $xfer += $output->writeFieldBegin('userEmail', TType::STRING, 3);
      $xfer += $output->writeString($this->userEmail);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class CertificateCredential {
  static $_TSPEC;

  /**
   * @var \Airavata\Model\Credential\Store\CommunityUser
   */
  public $communityUser = null;
  /**
   * @var string
   */
  public $x509Cert = null;
  /**
   * @var string
   */
  public $notAfter = null;
  /**
   * @var string
   */
  public $privateKey = null;
  /**
   * @var int
   */
  public $lifeTime = null;
  /**
   * @var string
   */
  public $notBefore = null;
  /**
   * @var int
   */
  public $persistedTime = null;
  /**
   * @var string
   */
  public $token = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'communityUser',
          'type' => TType::STRUCT,
          'class' => '\Airavata\Model\Credential\Store\CommunityUser',
          ),
        2 => array(
          'var' => 'x509Cert',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'notAfter',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'privateKey',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'lifeTime',
          'type' => TType::I64,
          ),
        6 => array(
          'var' => 'notBefore',
          'type' => TType::STRING,
          ),
        7 => array(
          'var' => 'persistedTime',
          'type' => TType::I64,
          ),
        8 => array(
          'var' => 'token',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['communityUser'])) {
        $this->communityUser = $vals['communityUser'];
      }
      if (isset($vals['x509Cert'])) {
        $this->x509Cert = $vals['x509Cert'];
      }
      if (isset($vals['notAfter'])) {
        $this->notAfter = $vals['notAfter'];
      }
      if (isset($vals['privateKey'])) {
        $this->privateKey = $vals['privateKey'];
      }
      if (isset($vals['lifeTime'])) {
        $this->lifeTime = $vals['lifeTime'];
      }
      if (isset($vals['notBefore'])) {
        $this->notBefore = $vals['notBefore'];
      }
      if (isset($vals['persistedTime'])) {
        $this->persistedTime = $vals['persistedTime'];
      }
      if (isset($vals['token'])) {
        $this->token = $vals['token'];
      }
    }
  }

  public function getName() {
    return 'CertificateCredential';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->communityUser = new \Airavata\Model\Credential\Store\CommunityUser();
            $xfer += $this->communityUser->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->x509Cert);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->notAfter);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->privateKey);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->lifeTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->notBefore);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->persistedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->token);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('CertificateCredential');
    if ($this->communityUser !== null) {
      if (!is_object($this->communityUser)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('communityUser', TType::STRUCT, 1);
      $xfer += $this->communityUser->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->x509Cert !== null) {
      $xfer += $output->writeFieldBegin('x509Cert', TType::STRING, 2);
      $xfer += $output->writeString($this->x509Cert);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->notAfter !== null) {
      $xfer += $output->writeFieldBegin('notAfter', TType::STRING, 3);
      $xfer += $output->writeString($this->notAfter);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->privateKey !== null) {
      $xfer += $output->writeFieldBegin('privateKey', TType::STRING, 4);
      $xfer += $output->writeString($this->privateKey);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->lifeTime !== null) {
      $xfer += $output->writeFieldBegin('lifeTime', TType::I64, 5);
      $xfer += $output->writeI64($this->lifeTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->notBefore !== null) {
      $xfer += $output->writeFieldBegin('notBefore', TType::STRING, 6);
      $xfer += $output->writeString($this->notBefore);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->persistedTime !== null) {
      $xfer += $output->writeFieldBegin('persistedTime', TType::I64, 7);
      $xfer += $output->writeI64($this->persistedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->token !== null) {
      $xfer += $output->writeFieldBegin('token', TType::STRING, 8);
      $xfer += $output->writeString($this->token);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class PasswordCredential {
  static $_TSPEC;

  /**
   * @var string
   */
  public $gatewayId = null;
  /**
   * @var string
   */
  public $portalUserName = null;
  /**
   * @var string
   */
  public $loginUserName = null;
  /**
   * @var string
   */
  public $password = null;
  /**
   * @var string
   */
  public $description = null;
  /**
   * @var int
   */
  public $persistedTime = null;
  /**
   * @var string
   */
  public $token = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'gatewayId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'portalUserName',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'loginUserName',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'password',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'description',
          'type' => TType::STRING,
          ),
        6 => array(
          'var' => 'persistedTime',
          'type' => TType::I64,
          ),
        7 => array(
          'var' => 'token',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['gatewayId'])) {
        $this->gatewayId = $vals['gatewayId'];
      }
      if (isset($vals['portalUserName'])) {
        $this->portalUserName = $vals['portalUserName'];
      }
      if (isset($vals['loginUserName'])) {
        $this->loginUserName = $vals['loginUserName'];
      }
      if (isset($vals['password'])) {
        $this->password = $vals['password'];
      }
      if (isset($vals['description'])) {
        $this->description = $vals['description'];
      }
      if (isset($vals['persistedTime'])) {
        $this->persistedTime = $vals['persistedTime'];
      }
      if (isset($vals['token'])) {
        $this->token = $vals['token'];
      }
    }
  }

  public function getName() {
    return 'PasswordCredential';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->portalUserName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->loginUserName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->password);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->description);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->persistedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->token);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('PasswordCredential');
    if ($this->gatewayId !== null) {
      $xfer += $output->writeFieldBegin('gatewayId', TType::STRING, 1);
      $xfer += $output->writeString($this->gatewayId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->portalUserName !== null) {
      $xfer += $output->writeFieldBegin('portalUserName', TType::STRING, 2);
      $xfer += $output->writeString($this->portalUserName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->loginUserName !== null) {
      $xfer += $output->writeFieldBegin('loginUserName', TType::STRING, 3);
      $xfer += $output->writeString($this->loginUserName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->password !== null) {
      $xfer += $output->writeFieldBegin('password', TType::STRING, 4);
      $xfer += $output->writeString($this->password);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->description !== null) {
      $xfer += $output->writeFieldBegin('description', TType::STRING, 5);
      $xfer += $output->writeString($this->description);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->persistedTime !== null) {
      $xfer += $output->writeFieldBegin('persistedTime', TType::I64, 6);
      $xfer += $output->writeI64($this->persistedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->token !== null) {
      $xfer += $output->writeFieldBegin('token', TType::STRING, 7);
      $xfer += $output->writeString($this->token);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

final class Constant extends \Thrift\Type\TConstant {
  static protected $DEFAULT_ID;

  static protected function init_DEFAULT_ID() {
    return "DO_NOT_SET_AT_CLIENTS";
  }
}


